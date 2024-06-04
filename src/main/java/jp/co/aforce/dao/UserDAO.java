package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jp.co.aforce.beans.User;

public class UserDAO {

	private DataSource dataSource;

	public UserDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/users");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public boolean insertUser(User user) {

		try (Connection connection = dataSource.getConnection()) {

			String sql = "INSERT INTO users (login_id, password, last_name, first_name, gender, birth_year, birth_month, birth_day, job, phone_number, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, user.getLogin_id());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getFirst_name());
			pstmt.setString(4, user.getFirst_name());
			pstmt.setString(5, String.valueOf(user.getGender()));
			pstmt.setInt(6, user.getBirth_day());
			pstmt.setInt(7, user.getBirth_day());
			pstmt.setInt(8, user.getBirth_day());
			pstmt.setString(9, user.getJob());
			pstmt.setString(10, user.getPhone_number());
			pstmt.setString(11, user.getEmail());

			int result = pstmt.executeUpdate();

			return result > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	public static User getUserByLoginId(String loginId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	
	}
}
