<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All users by name</title>
</head>
<body>
<h2>All users by name!</h2>
	<form action="ListByNameServlet" method="post">

		<label>Name: <input type="text" name="name"><br />
		</label> 
		<label><input type="submit" /></label>

	</form>
<c:if test="${listByName != null}">
     <c:redirect url="/listByNameResult.jsp" />
</c:if>

<br />
	<form action="/webNotebook/StartServlet">
		<button type="submit">Start page</button>
	</form>
</body>
</html>