<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="static_res/css/style.css">
<title>List all newspapers</title>
</head>
<body>
	<h1>List Of Newspapers</h1>
	<table border = 1>
		<tr>
			<th>ISSN</th>
			<th>Title</th>
			<th>Description</th>
			<th>Qty per year</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${newspaperList}" var="nl">
			<tr>
				<td>${nl.issn}</td>
				<td>${nl.title}</td>
				<td>${nl.discription}</td>
				<td>${nl.qtyPerYear}</td>
				<td>${nl.price}$</td>
			</tr>
		</c:forEach>
	</table>
	<form action="/EPAM_courses_web_app"><button>BACK</button></form>
</body>
</html>