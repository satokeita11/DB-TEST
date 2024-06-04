package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.User;
import jp.co.aforce.dao.UserDAO;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");

		try {
			
			String loginId = request.getParameter("login_id");
			String password = request.getParameter("password");
			String lastName = request.getParameter("last_name");
			String firstName = request.getParameter("first_name");
			char gender = request.getParameter("gender").charAt(0);
			int birthYear = Integer.parseInt(request.getParameter("birth_year"));
			int birthMonth = Integer.parseInt(request.getParameter("birth_month"));
			int birthDay = Integer.parseInt(request.getParameter("birth_day"));
			String job = request.getParameter("job");
			String phoneNumber = request.getParameter("phone_number");
			String email = request.getParameter("email");

			
			User user = new User(loginId, password, lastName, firstName, gender,
					birthYear, birthMonth, birthDay, job, phoneNumber, email);

			
			UserDAO userDAO = new UserDAO();
			boolean success = userDAO.insertUser(user);

			
			if (success) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				response.sendRedirect("views/registration_success.jsp");
			} else {
				response.sendRedirect("views/registration_error.jsp?error=db_error");
			}
		} catch (NumberFormatException e) {
	
			e.printStackTrace();
			response.sendRedirect("views/registration_error.jsp?error=invalid_input");
		} catch (Exception e) {
			
			e.printStackTrace();
			response.sendRedirect("views/registration_error.jsp?error=unknown_error");
		}
	}
}
