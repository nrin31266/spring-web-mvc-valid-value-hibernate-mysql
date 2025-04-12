<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Users</title>
</head>
<body>
	<h1>List of Users</h1>
	<button
		onclick="window.location.href='${pageContext.request.contextPath}/users/add'">
		Add User</button>

	<div style="padding: 8px; background-color: teal;">
		<c:forEach var="user" items="${users}">
			<c:set var="user" value="${user}" scope="request" />
			<jsp:include page="../components/userCard.jsp" />
		</c:forEach>
	</div>
</body>
</html>
