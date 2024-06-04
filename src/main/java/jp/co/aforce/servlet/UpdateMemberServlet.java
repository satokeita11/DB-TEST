package jp.co.aforce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.User;

@WebServlet("/UpdateMemberServlet")
public class UpdateMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		User currentUser = (User) session.getAttribute("user");

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

		if (currentUser != null && !loginId.equals(currentUser.getLogin_id()) ||
				!password.equals(currentUser.getPassword()) ||
				!lastName.equals(currentUser.getLast_name()) ||
				!firstName.equals(currentUser.getFirst_name()) ||
				gender != currentUser.getGender() ||
				birthYear != currentUser.getBirth_year() ||
				birthMonth != currentUser.getBirth_month() ||
				birthDay != currentUser.getBirth_day() ||
				!job.equals(currentUser.getJob()) ||
				!phoneNumber.equals(currentUser.getPhone_number()) ||
				!email.equals(currentUser.getEmail())) {

			out.println("<form action=\"UpdateConfirmedServlet\" method=\"post\">");
			out.println("<input type=\"hidden\" name=\"login_id\" value=\"" + loginId + "\">");
			out.println("<input type=\"hidden\" name=\"password\" value=\"" + password + "\">");
			out.println("<input type=\"hidden\" name=\"last_name\" value=\"" + lastName + "\">");
			out.println("<input type=\"hidden\" name=\"first_name\" value=\"" + firstName + "\">");
			out.println("<input type=\"hidden\" name=\"gender\" value=\"" + gender + "\">");
			out.println("<input type=\"hidden\" name=\"birth_year\" value=\"" + birthYear + "\">");
			out.println("<input type=\"hidden\" name=\"birth_month\" value=\"" + birthMonth + "\">");
			out.println("<input type=\"hidden\" name=\"birth_day\" value=\"" + birthDay + "\">");
			out.println("<input type=\"hidden\" name=\"job\" value=\"" + job + "\">");
			out.println("<input type=\"hidden\" name=\"phone_number\" value=\"" + phoneNumber + "\">");
			out.println("<input type=\"hidden\" name=\"email\" value=\"" + email + "\">");
			out.println("<input type=\"submit\" value=\"確認\">");
			out.println("</form>");

		} else {
			out.println("<h2>変更する情報がありません。</h2>");
		}

	}

}
