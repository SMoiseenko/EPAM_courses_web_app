<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='shortcut icon' type='image/x-icon'
	href="resources/images/favicon.ico" />
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Fredericka+the+Great" />
<title>Authorization failed</title>
</head>
<body>
<div id = "header">
${badAuthorization}
</div>
<div id = "main">
<form action="${pageContext.request.contextPath}/">
		<button>BACK</button>
	</form>
</div>

<%@ include file="footerPage.jsp" %>