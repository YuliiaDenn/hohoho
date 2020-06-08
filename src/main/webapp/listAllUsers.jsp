<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All users</title>
</head>
<body>

	<div align="left">
		<table border="1">
		<tr><th></th><th>Surname</th><th>Name</th><th>Second Name</th><th>Phone Number</th></tr>
			<c:forEach var="num" items="${allUsers}">
				<tr><td>${num.id}</td>
					<td>${num.surname}</td>
					<td>${num.name}</td>
					<td>${num.secondName}</td>
					<td>${num.phoneNumber}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<br />
	<form action="/webNotebook/StartServlet">
		<button type="submit">Start page</button>
	</form>
</body>
</html>