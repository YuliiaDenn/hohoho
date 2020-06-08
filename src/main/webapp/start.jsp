<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notepad!</title>
</head>
<body>
	<h2>Notepad!</h2>

	<form action="/webNotebook/AddServlet">
		<button type="submit">Add user</button>
	</form>
	<br/>
	<form action="/webNotebook/ListServlet">
		<button type="submit">List all users</button>
	</form>
	<br/>
	<form action="/webNotebook/ListByNameServlet">
		<button type="submit">List users by name</button>
	</form>
	<br/>
	<form action="/webNotebook/ListBySurnameServlet">
		<button type="submit">List users by surname</button>
	</form>
</body>
</html>
