<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>User ${newUser.surname} ${newUser.name} ${newUser.secondName}
		${newUser.phoneNumber} added!</p>
	<br />
	<form action="/webNotebook/StartServlet">
		<button type="submit">Start page</button>
	</form>


</body>
</html>