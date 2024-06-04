<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員情報変更</title>

</head>
<body>
	<h1>会員情報変更</h1>
	<form action="${pageContext.request.contextPath}/UpdateMemberServlet"
		method="post">
		<label for="login_id">■ユーザーID:</label> <input type="text"
			id="login_id" name="login_id" required><br> <label
			for="password">■パスワード:</label> <input type="password" id="password"
			name="password" required><br> <label for="last_name">■姓:</label>
		<input type="text" id="last_name" name="last_name" required><br>
		<label for="first_name">■名:</label> <input type="text" id="first_name"
			name="first_name" required><br> <label for="gender">■性別:</label>
		<input type="radio" id="male" name="gender" value="M" required>
		<label for="male">男性</label> <input type="radio" id="female"
			name="gender" value="F" required> <label for="female">女性</label><br>
		<label for="birth_year">■生年月日:</label> <input type="text"
			id="birth_year" name="birth_year" placeholder="年" required> <input
			type="text" id="birth_month" name="birth_month" placeholder="月"
			required> <input type="text" id="birth_day" name="birth_day"
			placeholder="日" required><br> <label for="job">■職業:</label>
		<input type="text" id="job" name="job"><br> <label
			for="phone_number">■電話番号:</label> <input type="tel" id="phone_number"
			name="phone_number" pattern="[0-9]{10,11}"><br> <label
			for="email">■メールアドレス:</label> <input type="email" id="email"
			name="email" required><br> <input type="submit"
			value="変更"> <input type="reset" value="リセット"> <a>
			href="index.jsp">戻る</a>
	</form>
</body>
</html>
