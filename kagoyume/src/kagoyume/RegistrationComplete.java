package kagoyume;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationComplete
 */

public class RegistrationComplete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		try{
			//不正アクセス確認
			String accesschk = request.getParameter("acRegistration");
	    	if(accesschk == null || (Integer)session.getAttribute("acRegistration") != Integer.parseInt(accesschk)){
	    		throw new Exception("不正なアクセスです");
	    	}

	    	UserData formData = (UserData)session.getAttribute("formData");
			UserDataDTO insertData = formData.UDToUDD();

			//新規ユーザー情報をuser_tテーブルに挿入する
			UserDataDAO.getInstance().insertUser(insertData);

			//新規ユーザー登録が完了したので、登録に使用したデータをセッションから削除する
			session.removeAttribute("formData");
			session.removeAttribute("submited");

		}catch(Exception e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            return;
		}

		request.getRequestDispatcher("/registrationcomplete.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
