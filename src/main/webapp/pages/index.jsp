<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='shortcut icon' type='image/x-icon' href="resources/images/favicon.ico" />
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Fredericka+the+Great" />
<title>Periodicals subscribe service. Login page</title>
</head>
<body>

	<div class="header">Login Form</div>
	<div class="header">

		<form action="${pageContext.request.contextPath}/autorisation">
			<label for="uname"><b>Username</b></label> <input type="text" placeholder="Enter Username" name="uname" required>
			<br> 
			<label for="psw"><b>Password</b></label> <input type="password" placeholder="Enter Password" name="psw"	required>
			<br>
			<label> <input type="checkbox" name="remember">Remember me</label>
			<button type="submit">Login</button>

			<div class="container">
				<button type="button" class="cancelbtn">Cancel</button>
			</div>
		</form>
		<form action="${pageContext.request.contextPath}/hello">
			<button>Register</button>
		</form>
	</div>


</body>
</html>