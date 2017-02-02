package kagoyume;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sdk.ResultSet;
import sdk.ResultSet.Result.Hit;

/**
 * Servlet implementation class Search
 */

public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		try{

			String tmp = new String (request.getParameter("searchWard").getBytes("ISO-8859-1"));
			String searchWard = URLDecoder.decode(tmp,"UTF-8");

			//検索ワードが空白の場合はエラー画面に遷移
			if(searchWard.trim().equals("")){
				throw new Exception("検索ワードが未入力です");
			}

			List<ItemData> resultData = new ArrayList<>();

			//検索ワードで検索を行い、検索結果を取得
			ResultSet searchResult = YahooSearch.getInstanse().execute(searchWard);

			String hitCount = searchResult.getTotalResultsAvailable();

			int count = 0;
			for (Hit hit: searchResult.getResult().getHit()) {
				resultData.add(new ItemData());
				resultData.get(count).setName(hit.getName());
				resultData.get(count).setCode(hit.getCode());
				resultData.get(count).setPrice(Integer.valueOf(hit.getPrice().getValue()));
				resultData.get(count).setImg_small(hit.getImage().getSmall());

				count++;
			}

			session.setAttribute("searchWard", searchWard);
			session.setAttribute("hitCount", hitCount);
			session.setAttribute("resultData", resultData);
			request.getRequestDispatcher("/search.jsp").forward(request, response);

		}catch(NullPointerException e){
			//検索ワードが存在しない場合は不正なアクセスとみなす
			request.setAttribute("error", "不正なアクセスです");
			request.getRequestDispatcher("/error.jsp").forward(request, response);;
		}catch(Exception e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}

}
