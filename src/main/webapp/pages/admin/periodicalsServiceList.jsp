<%@ include file="../service/mainHeader.jsp"%>
<title>List Of Periodicals</title>
</head>
<body>
	<div id="header">List Of Periodicals<br>
	
	<%@ include file="../admin/adminHeader.jsp" %>
	
	</div>
	<div id="main">
		<table class="periodicalsadminlist">
			<thead>
				<tr>
					<th>ISSN</th>
					<th>Title</th>
					<th>Description</th>
					<th>Qty per year</th>
					<th>Price</th>
				</tr>
			</thead>
			<c:forEach items="${periodicalList}" var="pl">
				<tbody>
					<tr>
						<td><a href="${pageContext.request.contextPath}/periodicalUpdateDelete/${pl.id}">${pl.issn}</a></td>
						<td>${pl.title}</td>
						<td>${pl.description}</td>
						<td>${pl.qtyPerYear}</td>
						<td>${pl.price}$</td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
		<br>
		<div id = "inputwrapper">
		<div id = "wrapper_center">
		Add new periodicals
		</div>
		<form name="addPeriodical"  action="${pageContext.request.contextPath}/addPeriodical" method="post">
			<label for="issn" >ISSN</label><input name="issn" type="text"  maxlength="9" value="1234-4321"><br>
			<label for="title" >Title</label><input name="title" type="text"  value="Enter title"><br>
			<label for="description" >Description</label><input name="description" type="text"  value="Enter description"><br>
			<label for="qtyPerYear" >Qty per year</label><input name="qtyPerYear" type="number"  value="0"><br>
			<label for="price" >Price</label><input name="price" type="number" step="0.01" min="0" value="0"><br>
			<div id = "wrapper_center">
			<button type="submit">Add data</button>
			</div>
		</form>
		</div>
			</div>
	<%@ include file="../service/footerPage.jsp" %>
	
	
	
	