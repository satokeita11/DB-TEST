<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>会員情報確認</title>
</head>
<body>
	<h1>会員情報確認</h1>
	<form action="CheckUser" method="post">
		<label for="login_id">ユーザーID:</label> <input type="text" id="login_id"
			name="login_id" required>
		<button type="submit">確認</button>
	</form>
</body>
</html>
