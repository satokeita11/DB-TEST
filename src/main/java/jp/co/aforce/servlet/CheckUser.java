package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.User;
import jp.co.aforce.dao.UserDAO;

@WebServlet("/CheckUser")
public class CheckUser extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String loginId = request.getParameter("login_id");

		User user = UserDAO.getUserByLoginId(loginId);

		if (user != null) {

			HttpSession session = request.getSession();
			session.setAttribute("user", user);

			RequestDispatcher dispatcher = request.getRequestDispatcher("views/edit-users.jsp");
			dispatcher.forward(request, response);
		} else {

			request.setAttribute("errorMessage", "入力されたユーザーIDが存在しません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/confirm_user_info.jsp");
			dispatcher.forward(request, response);
		}
	}
}
