<%@ include file="../service/mainHeader.jsp"%>
<title>Periodicals list</title>
</head>
<body>
<div id="header">Periodicals list<br>
<%@ include file="../user/userHeader.jsp" %>
</div>
<div id = "main">
<table>
			<tr>
				<th>ISSN</th>
				<th>Title</th>
				<th>Description</th>
				<th>Qty per year</th>
				<th>Price</th>
				<th>Subscribe</th>
			</tr>
			
			<c:forEach items="${periodicalsListForSubscribe}" var="pl">
			<tr>
				<td>${pl.issn}</td>
				<td>${pl.title}</td>
				<td>${pl.description}</td>
				<td>${pl.qtyPerYear}</td>
				<td>${pl.price}$</td>
				<td><form name="addSubscribe" action="${pageContext.request.contextPath}/addSubscribe" method="post">
			<input name="periodical_id" type="hidden"  value="${pl}">
			<input name="user" type="hidden"  value="${sessionScope.userLoged}">
			<input name="monthSubscribed" type="radio" value="1">month 
			<input name="monthSubscribed" type="radio" value="3">quarter 
			<input name="monthSubscribed" type="radio" value="12">year<br> 
			<button type="submit">Subscribe</button>
		</form>
		</td>
			</tr>
			</c:forEach>
		</table>














</div>

	<%@ include file="../service/footerPage.jsp" %>
	