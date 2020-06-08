<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All users by surname</title>
</head>
<body>
	<h2>All users by surname!</h2>

	<form action="ListBySurnameServlet" method="post">
		Surname: <input type="text" name="surname" /> <input type="submit" />

	</form>
	<c:if test="${listBySurname != null}">
		<c:redirect url="/listBySurnameResult.jsp" />
	</c:if>

	<br />
	<form action="/webNotebook/StartServlet">
		<button type="submit">Start page</button>
	</form>
</body>
</html>