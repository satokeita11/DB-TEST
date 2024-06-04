<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="jp.co.aforce.beans.User"%>
<%@ include file="../header.html"%>
<link rel="stylesheet" type="text/css" href="../CSS/login-success.css">

<%
User user = (User) session.getAttribute("user");

if (user == null) {
	response.sendRedirect("views/registration_error.jsp?error=no_user_in_session");
} else {
%>

こんにちは、<%=user.getLast_name()%>
<%=user.getFirst_name()%>さん。

<form action="${pageContext.request.contextPath}/Logout.action"
	method="post">
	<a href="product.jsp" class="btn">商品を見る</a>
</form>

<%
}
%>

<%@ include file="../footer.html"%>
