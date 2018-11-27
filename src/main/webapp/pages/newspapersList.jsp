<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>List all newspapers</title>
</head>
<body>
	<div class="header">List Of Newspapers</div>
	<div class="content">
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
						<td>${nl.description}</td>
						<td>${nl.qtyPerYear}</td>
						<td>${nl.price}$</td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
		<br>
		<form name = "addNewspaper" action="${pageContext.request.contextPath}/addNewspaper" method="post">
		ISSN
		<input title="ISSN" type="text" name="issn">
		Title
		<input title="Title" type="text" name="title">
		Description
		<input title="Description" type="text" name="description">
		Qty per year
		<input title="Qty per year" type="text" name="qtyPerYear">
		Price
		<input title="Price" type="text" name="price">
		<input type="submit" value="ADD">
		</form>
	</div>
	<div class="sidebar">
		
	</div>
	<div class="footer">
	<form action="${pageContext.request.contextPath}">
			<button>BACK</button>
		</form>
		
	</div>
</body>
</html>