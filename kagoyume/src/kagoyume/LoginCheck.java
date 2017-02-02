package kagoyume;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginCheck
 */

public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		try{
			//不正アクセス確認
			String accesschk = request.getParameter("acLogin");
	    	if(accesschk == null || (Integer)session.getAttribute("acLogin") != Integer.parseInt(accesschk)){
	    		throw new Exception("不正なアクセスです");
	    	}

	    	UserData formData = new UserData();
			formData.setName(request.getParameter("name"));
			formData.setPassward(request.getParameter("passward"));
			UserDataDTO loginData = formData.UDToUDD();

			String returnURL = request.getParameter("returnURL");

			//入力されたユーザー情報が存在するか確認する(検索結果を格納したUserDataDTOを取得、存在しないならnull値)
			loginData = UserDataDAO.getInstance().login(loginData);

			//検索結果を格納したUserDataDTOがnull値でない場合ログイン可能とみなす
			if(loginData != null){

				//ログインに成功したら、ユーザーをセッションに保存して元のページに戻る
				UserData loginUser = new UserData();
				loginUser.UDDToUD(loginData);
				session.setAttribute("loginUser", loginUser);

				System.out.println("Login OK!");
				request.getRequestDispatcher(returnURL).forward(request, response);
				return;
			}else{
				//ログインに失敗した場合は、ログインエラーページへ遷移
				request.setAttribute("returnURL", returnURL);
	            request.getRequestDispatcher("/errorlogin.jsp").forward(request, response);
	            return;
			}
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
		doGet(request,response);
	}

}
