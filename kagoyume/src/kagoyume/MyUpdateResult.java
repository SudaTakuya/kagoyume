package kagoyume;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyUpdateResult
 */

public class MyUpdateResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		try{
			//不正アクセス確認
			String accesschk = request.getParameter("acUpdate");
        	if(accesschk == null || (Integer)session.getAttribute("acUpdate") != Integer.parseInt(accesschk)){
        		throw new Exception("不正なアクセスです");
        	}

        	UserData loginUser = (UserData)session.getAttribute("loginUser");

    		UserData formData = new UserData();
    		formData.setUserID(loginUser.getUserID());
    		formData.setName(request.getParameter("name"));
    		formData.setPassward(request.getParameter("passward"));
    		formData.setMail(request.getParameter("mail"));
    		formData.setAddress(request.getParameter("address"));

    		UserDataDTO updateData = formData.UDToUDD();

			//ユーザー登録情報の更新を行う
			Timestamp updateTime = UserDataDAO.getInstance().updateUser(updateData);

			//セッションのログインユーザー情報を更新
			loginUser.setName(formData.getName());
			loginUser.setPassward(formData.getPassward());
			loginUser.setMail(formData.getMail());
			loginUser.setAddress(formData.getAddress());
			loginUser.setNewDate(new Date(updateTime.getTime()));
			session.setAttribute("loginUser", loginUser);

			request.setAttribute("formData", formData);
			request.getRequestDispatcher("/myupdateresult.jsp").forward(request, response);
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
