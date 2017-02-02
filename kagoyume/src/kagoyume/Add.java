package kagoyume;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Add
 */

public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		ItemData addData = (ItemData)session.getAttribute("detailData");

		//既存のカートが存在しない場合は新規作成する
		List<ItemData> cart = (List<ItemData>)session.getAttribute("cart");
		if(cart == null){
			cart = new ArrayList<ItemData>();
		}

		//セッションスコープ内のカートに商品情報を追加
		cart.add(addData);
		session.setAttribute("cart", cart);

		request.getRequestDispatcher("/add.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
