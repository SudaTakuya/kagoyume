package kagoyume;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		String isLogin = request.getParameter("isLogin");
		String returnURL = request.getParameter("returnURL");

		if(isLogin.equals("true")){
			//ログイン済みならばログアウト処理を行う
			session.removeAttribute("loginUser");
			session.removeAttribute("cart");

			System.out.println("Logout OK!");
			request.getRequestDispatcher(returnURL).forward(request, response);
		}else if(isLogin.equals("false")){
			//未ログインならばログイン画面へ遷移
			//不正アクセス防止用のコードを発行（ログイン処理)
			session.setAttribute("acLogin", (int) (Math.random() * 1000));
			request.setAttribute("returnURL", returnURL);
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "不正なアクセスです");
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
