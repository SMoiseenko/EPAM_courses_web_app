<%@ include file="../service/mainHeader.jsp"%>
<title>All users list</title>
</head>
<body>
	<div id="header">
		All users list<br>
		<%@ include file="../admin/adminHeader.jsp"%>
	</div>
	<div id="main">
		Your are login as: ${USERNAME}<br> Cookie:
		${cookie.hitCounter.value}<br>
		<table>
			<tr>
				<th>ID</th>
				<th>Login</th>
				<th>Password</th>
				<th>Role</th>
				<th>Name</th>
				<th>Surname</th>
				<th>E-mail</th>
				<th>Mob. number</th>
				<th>Address</th>
				<th>Balance</th>
				<th>Status</th>
			</tr>
			<c:forEach items="${usersList}" var="usr">
				<tr>
					<td>${usr.id}</td>
					<td>${usr.login}</td>
					<td>${usr.password}</td>
					<td>${usr.userRole}</td>
					<td>${usr.firstName}</td>
					<td>${usr.lastName}</td>
					<td>${usr.email}</td>
					<td>${usr.phoneNumber}</td>
					<td>${usr.address}</td>
					<td>${usr.balance}$</td>
					<td>${usr.active}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<%@ include file="../service/footerPage.jsp"%>