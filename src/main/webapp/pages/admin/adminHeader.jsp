<div id="userinfo_left">
	<b>Hello: </b><c:out value="${sessionScope.userLoged.firstName}" /> 
		  <c:out value="${sessionScope.userLoged.lastName}" /><br>
	<b>Role: </b><c:out value="${sessionScope.userLoged.userRole}" /><br>	  
</div>

<div id="userinfo_right">
	<form action="${pageContext.request.contextPath}/periodicals">
		<button>Management of all periodicals</button>
	</form>

	<form
		action="${pageContext.request.contextPath}/userslist"
		method="post">
		<button>Management of all users</button>
	</form>

	
		<button onclick="history.back()">Step back</button>
	

	<form action="${pageContext.request.contextPath}/signout">
		<button>Exit account</button>
	</form>

</div>