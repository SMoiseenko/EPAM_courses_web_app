<%@ include file="../service/mainHeader.jsp"%>
<title>Periodicals list</title>
</head>
<body>
<div id="header">User Subscription list<br>
<%@ include file="../user/userHeader.jsp" %>
</div>
<div id = "main">
<table>
			<tr>
				<th>Id</th>
				<th>Title</th>
				<th>Months Of Subscription</th>
				<th>Begin Date</th>
				<th>End Date</th>
				<th>Total Price</th>
				<th>Paid</th>
				<th>Status</th>
			</tr>
			
			<c:forEach items="${userSubscriptionList}" var="sl">
			<tr>
				<td>${sl.id}</td>
				<td>${sl.periodical.title}</td>
				<td>${sl.monthSubscribed}</td>
				<td>${sl.dateBeginSubscribe}</td>
				<td>${sl.dateEndSubscribe}</td>
				<td>${sl.totalPrice}$</td>
				<td>${sl.paid}$</td>
				<td>${sl.active}</td>
			</tr>
			</c:forEach>
		</table>

</div>
<%@ include file="../service/footerPage.jsp" %>
