package kagoyume;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BuyComplete
 */

public class BuyComplete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		try{
			//不正アクセス確認
			String accesschk = request.getParameter("acBuy");
	    	if(accesschk == null || (Integer)session.getAttribute("acBuy") != Integer.parseInt(accesschk)){
	    		throw new Exception("不正なアクセスです");
	    	}

			UserData loginUser = (UserData)session.getAttribute("loginUser");

			int userID = loginUser.getUserID();
			ArrayList<ItemData> cart = (ArrayList<ItemData>) session.getAttribute("cart");
			int type = Integer.parseInt(request.getParameter("type"));
			int total = Integer.parseInt(request.getParameter("total"));

			//購入商品をbuy_tテーブルに挿入
			UserDataDAO.getInstance().insertBuy(userID, cart, type);
			//user_tテーブルの合計購入金額を更新
			UserDataDAO.getInstance().updateTotal(userID, total);
			//ログインユーザーの合計購入金額を更新
			loginUser.setTotal(loginUser.getTotal() + total);
			session.setAttribute("loginUser", loginUser);

			//購入が完了したら、セッションスコープのカートの商品を削除する
			session.removeAttribute("cart");

			request.getRequestDispatcher("/buycomplete.jsp").forward(request, response);
		}catch(Exception e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
