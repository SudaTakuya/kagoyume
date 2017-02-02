package kagoyume;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationConfirm
 */

public class RegistrationConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		try{
			//不正アクセス確認
			String accesschk = request.getParameter("acRegistration");
	    	if(accesschk == null || (Integer)session.getAttribute("acRegistration") != Integer.parseInt(accesschk)){
	    		throw new Exception("不正なアクセスです");
	    	}

			UserData formData = new UserData();
			formData.setName(request.getParameter("name"));
			formData.setPassward(request.getParameter("passward"));
			formData.setMail(request.getParameter("mail"));
			formData.setAddress(request.getParameter("address"));

			//入力内容の未入力チェックを行い、不足項目を表す文字列をリクエストに保存
			String checkStr = formData.checkForm();
			request.setAttribute("checkStr",checkStr);

			session.setAttribute("submited", "true");
			session.setAttribute("formData", formData);

			request.getRequestDispatcher("/registrationconfirm.jsp").forward(request, response);
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
