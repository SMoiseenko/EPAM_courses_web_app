<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='shortcut icon' type='image/x-icon' href="resources/images/favicon.ico" />
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Fredericka+the+Great" />
<title>Registration new user</title>
</head>
<body>
	<div id="header">Registration form</div>
<div id="main">	
<div id = "inputwrapper">
		<form action="${pageContext.request.contextPath}/registration" method="post">
			<label for="login"><b>Login</b></label> <input type="text" placeholder="Enter Login" name="login" required><br>
			<label for="password"><b>Password</b></label> <input type="password" placeholder="Enter Password" name="password" required><br>
			<label for="first_name"><b>First name</b></label> <input type="text" placeholder="Enter first name" name="firstName" required><br> 
			<label for="last_name"><b>Last name</b></label> <input type="text" placeholder="Enter last name" name="lastName" required><br>
			<label for="email"><b>E-mail</b></label> <input	type="email" placeholder="Enter e-mail" name="email" required><br> 
			<label for="phone"><b>Phone	number</b></label> <input type="text" placeholder="Enter phone number" name="phoneNumber" required><br>
			<label for="address"><b>Address</b></label> <input type="text" placeholder="Enter address" name="address" required><br>

			<button type="submit">Sign up</button>
		</form>
</div>
		<form action="${pageContext.request.contextPath}/">
			<button>BACK</button>
		</form>
</div>
	
	
	<%@ include file="./footerPage.jsp"%>
	
	