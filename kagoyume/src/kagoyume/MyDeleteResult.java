package kagoyume;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyDeleteResult
 */

public class MyDeleteResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		try{
			//不正アクセス確認
			String accesschk = request.getParameter("acDelete");
        	if(accesschk == null || (Integer)session.getAttribute("acDelete") != Integer.parseInt(accesschk)){
        		throw new Exception("不正なアクセスです");
        	}

			UserData loginUser = (UserData)session.getAttribute("loginUser");
			int deleteID = loginUser.getUserID();

			//削除ユーザーのdeleteFlagを1(削除済み)にする
			UserDataDAO.getInstance().deleteUser(deleteID);

			//セッションからログインユーザーを削除する
			session.removeAttribute("loginUser");

			request.getRequestDispatcher("/mydeleteresult.jsp").forward(request, response);
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
