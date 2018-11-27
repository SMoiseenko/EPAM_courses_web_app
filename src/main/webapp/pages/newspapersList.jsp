<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="static_res/css/style.css">
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Fredericka+the+Great">
<title>List all newspapers</title>
</head>
<body>
	<div class = "header">List Of Newspapers</div>
	<div class = "content">
	<table>
		<thead>
			<tr>
				<th>ISSN</th>
				<th>Title</th>
				<th>Description</th>
				<th>Qty per year</th>
				<th>Price</th>
			</tr>
		</thead>
		<c:forEach items="${newspaperList}" var="nl">
			<tbody>
				<tr>
					<td>${nl.issn}</td>
					<td>${nl.title}</td>
					<td>${nl.discription}</td>
					<td>${nl.qtyPerYear}</td>
					<td>${nl.price}$</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
	</div>
	<div class = "sidebar">
	<form action="/EPAM_courses_web_app">
		<button>BACK</button>
	</form>
	</div>
	<div class = "footer">
	
	</div>
</body>
</html>