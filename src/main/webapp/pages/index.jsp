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

	<div id="header">Periodicals subscribe service</div>

	<div id="sign_in">
		<h1>sign in</h1>
		<div id="wrapper_center">

			<form action="${pageContext.request.contextPath}/authorization" method="post">
				<label for="login"><b>Login</b></label> <input type="text" placeholder="Enter Login" name="login" required>
				<br> <label for="password"><b>Password</b></label> <input type="password" placeholder="Enter Password"
					name="password" required> <br> <label> <input type="checkbox" name="remember">Remember
					me
				</label>
				<button type="submit">Sign in</button>
			</form>
		</div>
	</div>
	<div id="sign_up">
		<h1>sign up</h1>
		<div id="wrapper_center">

			<form action="${pageContext.request.contextPath}/userRegistrationForm">
				<button>Sign up</button>
			</form>


		</div>
	</div>
	<div id="main">
		<div id="wrapper_center">
			<form action="${pageContext.request.contextPath}/newspapers">
				<button>Continue without login</button>
			</form>
			<form action="${pageContext.request.contextPath}/userslist?uname=shit&psw=canhappend" method="post">
				<button>List all users</button>
			</form>
			
		</div>
	</div>

	<%@ include file="service/footerPage.jsp"%>