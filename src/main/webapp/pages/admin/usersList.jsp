<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/png"
	href="resources/images/icon.png" />
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Fredericka+the+Great" />
<title>All users list</title>
</head>
<body>
	<div class="header">
		All users list<br> Your are login as: ${USERNAME}<br>

	</div>

	<table class="userlistadmin">
		<thead>
			<tr>
				<th>ID</th>
				<th>Login</th>
				<th>Password</th>
				<th>Role</th>
				<th>Name</th>
				<th>Surname</th>
				<th>E-mail</th>
				<th>Mob. number</th>
				<th>Address</th>
				<th>Status</th>
			</tr>
		</thead>
		<c:forEach items="${usersList}" var="usr">
			<tbody>
				<tr>
					<td>${usr.id}</td>
					<td>${usr.login}</td>
					<td>${usr.password}</td>
					<td>${usr.role.role}</td>
					<td>${usr.firstName}</td>
					<td>${usr.lastName}</td>
					<td>${usr.email}</td>
					<td>${usr.phoneNumber}</td>
					<td>${usr.address}</td>
					<td>${usr.active}</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
	<form action="${pageContext.request.contextPath}/">
		<button>BACK</button>
	</form>
</body>
</html>