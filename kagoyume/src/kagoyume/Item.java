package kagoyume;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sdklookup.ResultSet;
import sdklookup.ResultSet.Result.Hit;

/**
 * Servlet implementation class Item
 */

public class Item extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		try{

			ArrayList<ItemData> resultData = (ArrayList<ItemData>)session.getAttribute("resultData");

			String tmp = new String (request.getParameter("detailCode").getBytes("ISO-8859-1"));
			String detailCode = URLDecoder.decode(tmp,"UTF-8");

			ItemData detailData = new ItemData();
			//商品コードをもとに指定の商品情報を得て、その情報をItemDataに格納する
			ResultSet searchResult = YahooSearch.getInstanse().executeByCode(detailCode);
			Hit hit = searchResult.getResult().getHit().get(0);
			detailData.setName(hit.getName());
			detailData.setCode(hit.getCode());
			detailData.setPrice(Integer.valueOf(hit.getPrice().getValue()));
			detailData.setImg_small(hit.getImage().getSmall());
			detailData.setImg_large(hit.getExImage().getUrl());
			detailData.setDescription(hit.getDescription());
			detailData.setReviewRate(Double.parseDouble(hit.getReview().getRate()));
			detailData.setReviewCount(Integer.parseInt(hit.getReview().getCount()));
			detailData.setReviewUrl(hit.getReview().getUrl());

			session.setAttribute("detailData", detailData);

			request.getRequestDispatcher("/item.jsp").forward(request, response);

		}catch(Exception e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            return;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
