<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<link rel="stylesheet" type="text/css" href="../CSS/login.css">


</head>
<body>
	<h1>ログイン</h1>
	<form action="${pageContext.request.contextPath}/LoginServlet"
		method="post">
		<label for="login_id">ユーザーID:</label> <input type="text" id="login_id"
			name="login_id" required><br> <label for="password">パスワード:</label>
		<input type="password" id="password" name="password" required><br>
		<input type="submit" value="ログイン">
	</form>
</body>
</html>
