<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/png"
	href="../resources/images/icon.png" />
<link rel="stylesheet" type="text/css" href="../resources/css/style.css">
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Fredericka+the+Great">
<title>Insert title here</title>
</head>
<body>
	<div id="header">${newspaper.title}</div>
	<div id="main">
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
		<tbody>
			<tr>
				<td>${newspaper.issn}</td>
				<td>${newspaper.title}</td>
				<td>${newspaper.description}</td>
				<td>${newspaper.qtyPerYear}</td>
				<td>${newspaper.price}</td>
			</tr>
	</tbody>		
	</table>
	<form action="${pageContext.request.contextPath}/newspapers">
		<button>BACK</button>
	</form>
</div>
<%@ include file="../service/footerPage.jsp" %>

