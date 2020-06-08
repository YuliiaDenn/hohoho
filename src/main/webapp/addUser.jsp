<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New user</title>
</head>
<body>

	<c:if test="${newUser == null}">
		<p>Add User!</p>
	</c:if>

	<form action="AddServlet" method="post">
		<label>Surname: <input type="text" name="surname"><br />
		</label> <label>Name: <input type="text" name="name"><br />
		</label> <label>Second Name: <input type="text" name="secondName"><br />
		</label> <label>Phone Number: <input type="text" name="phoneNumber"><br />
		</label>
		<button type="submit">Submit</button>
	</form>
	<c:if test="${newUser != null}">
		<c:redirect url="/added.jsp" />
	</c:if>

	<br />
	<form action="/webNotebook/StartServlet">
		<button type="submit">Start page</button>
	</form>
</body>
</html>