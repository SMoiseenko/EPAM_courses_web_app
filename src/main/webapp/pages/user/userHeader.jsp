<div id="userinfo_left">
	<b>Hello: </b><c:out value="${sessionScope.userLoged.firstName}" /> 
		  <c:out value="${sessionScope.userLoged.lastName}" /><br>
	<b>Role: </b><c:out value="${sessionScope.userLoged.userRole}" /><br>
	<b>ID: </b>	 <c:out value="${sessionScope.userLoged.id}" /><br> 
</div>

<div id="userinfo_right">


	<form
		action="${pageContext.request.contextPath}/periodicalsListForSubscribe">
		<button>List of all periodicals</button>
	</form>

	<form
		action="${pageContext.request.contextPath}/userslist?uname=shit&psw=canhappend"
		method="post">
		<button>List of all subscribes</button>
	</form>


	<button onclick="history.back()">Step back</button>


	<form action="${pageContext.request.contextPath}/">
		<button>Exit account</button>
	</form>

</div>