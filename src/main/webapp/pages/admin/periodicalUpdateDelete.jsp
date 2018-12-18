<%@ include file="../service/mainHeader.jsp"%>
<title>Edit "${periodical.title}"</title>
</head>
<body>
	<div id="header">Edit "${periodical.title}"<br>
		<%@ include file="../admin/adminHeader.jsp"%>
	</div>
	<div id="main">
		<table id="newspappersadminlist table">
			<tr>
				<th>ISSN</th>
				<th>Title</th>
				<th>Description</th>
				<th>Qty per year</th>
				<th>Price</th>
				<th>Active</th>
			</tr>
			<tr>
				<td>${periodical.issn}</td>
				<td>${periodical.title}</td>
				<td>${periodical.description}</td>
				<td>${periodical.qtyPerYear}</td>
				<td>${periodical.price}$</td>
				<td>${periodical.active}</td>
			</tr>
		</table>
	<div id = "inputwrapper">
		<div id = "wrapper_center">
		Edit periodicals
		</div>
		<form name="editPeriodical"  action="${pageContext.request.contextPath}/editPeriodical" method="post">
		
			<label for="id" ></label><input name="id" type="hidden"  value="${periodical.id}"><br>
			<label for="issn" >ISSN</label><input name="issn" type="text"  maxlength="9" value="${periodical.issn}"><br>
			<label for="title" >Title</label><input name="title" type="text"  value="${periodical.title}"><br>
			<label for="description" >Description</label><input name="description" type="text"  value="${periodical.description}"><br>
			<label for="qtyPerYear" >Qty per year</label><input name="qtyPerYear" type="number"  value="${periodical.qtyPerYear}"><br>
			<label for="price" >Price, $</label><input name="price" type="number" step="0.01" min="0" value="${periodical.price}"><br><br>
			<div id = "wrapper_center">
			<button type="submit">Save changes</button>
		</form>
			
		<form name="deletePeriodical" action="${pageContext.request.contextPath}/deletePeriodical" method="post">
				<input name="id" type="hidden"  value="${periodical.id}">
				<button >Delete periodicals</button>
			</form>
			</div>
		</div>
	
		
	
	<%@ include file="../service/footerPage.jsp"%>