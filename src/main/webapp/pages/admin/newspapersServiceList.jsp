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
<title>List all newspapers</title>
</head>
<body>
	<div id="header">List Of Newspapers</div>
	<div id="main">
		<table class="newspappersadminlist">
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
						<td><a href="${pageContext.request.contextPath}/newspaperUpdateDelete/${nl.id}">${nl.issn}</a></td>
						<td>${nl.title}</td>
						<td>${nl.description}</td>
						<td>${nl.qtyPerYear}</td>
						<td>${nl.price}$</td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
		<br>
		<form name="addNewspaper" action="${pageContext.request.contextPath}/addNewspaper" method="post">
			ISSN <input name="issn" type="text" name="issn" maxlength="9" value="1234-4321">
			Title <input name="title" type="text" name="title" value="Enter title">
			Description <input name="description" type="text" name="description" value="Enter description">
			Qty per year <input name="qtyPerYear" type="number" name="qtyPerYear" value="0"> 
			Price <input name="price" type="number" step="0.01" min="0" value="0"> 
			<input type="submit" value="Add new newspaper">
		</form>
	<form action="${pageContext.request.contextPath}/">
			<button>BACK</button>
		</form>	
		</div>
	<%@ include file="../service/footerPage.jsp" %>
	
	
	
	