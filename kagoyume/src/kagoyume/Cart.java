package kagoyume;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cart
 */

public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		//カートに遷移したときに未ログインの場合はログイン画面に遷移
		if(session.getAttribute("loginUser") == null){
			request.setAttribute("returnURL", "/Cart");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}

		//不正アクセス防止用のコードを発行（購入処理)
		session.setAttribute("acBuy", (int) (Math.random() * 1000));

		request.getRequestDispatcher("/cart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
