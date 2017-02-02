package kagoyume;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BuyConfirm
 */

public class BuyConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session= request.getSession();

		try{
			//不正アクセス確認
			String accesschk = request.getParameter("acBuy");
	    	if(accesschk == null || (Integer)session.getAttribute("acBuy") != Integer.parseInt(accesschk)){
	    		throw new Exception("不正なアクセスです");
	    	}

	    	request.getRequestDispatcher("/buyconfirm.jsp").forward(request, response);
		}catch(Exception e){
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
