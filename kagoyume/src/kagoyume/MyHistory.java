package kagoyume;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sdklookup.ResultSet;
import sdklookup.ResultSet.Result.Hit;

/**
 * Servlet implementation class MyHistory
 */

public class MyHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		try{
			List<ItemData> historyItem = new ArrayList<>();

			int userID = Integer.parseInt(request.getParameter("userID"));

			//userIDをもとに購入履歴の商品コードを取得
			List<String> historyCode = UserDataDAO.getInstance().searchHistory(userID);
			//購入商品の商品コードから商品情報を取得
			List<ResultSet> historyData = YahooSearch.getInstanse().executeByHistoryCode(historyCode);

			//商品情報をItemDataのListに格納
			int count = 0;
			for(ResultSet rset : historyData){
				historyItem.add(new ItemData());
				Hit hit = rset.getResult().getHit().get(0);
				historyItem.get(count).setName(hit.getName());
				historyItem.get(count).setPrice(Integer.valueOf(hit.getPrice().getValue()));
				count++;
			}
			System.out.println("OK");
			request.setAttribute("historyItem", historyItem);
			request.getRequestDispatcher("/myhistory.jsp").forward(request, response);
		}catch(Exception e){
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("/error.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
