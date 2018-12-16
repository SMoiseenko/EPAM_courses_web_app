<%@ include file="service/mainHeader.jsp"%>
<title>Periodicals subscribe service. Login page</title>
</head>
<body>

	<div id="header">Periodicals subscribe service</div>

	<div id="sign_in">
		<h1>SIGN IN</h1>
		<div id="wrapper_center">
<div id = "inputwrapper">
			<form action="${pageContext.request.contextPath}/authorization" method="post">
				<label for="login"><b>Login</b></label> <input type="text" placeholder="Enter Login" name="login" required>
				<br> <label for="password"><b>Password</b></label> <input type="password" placeholder="Enter Password"
					name="password" required><br>
					
					<label> <input type="checkbox" name="remember">Remember
					me
				</label>
				<button type="submit">Sign in</button>
			</form>
			</div> 
		</div>
	</div>
	<div id="sign_up">
		<h1>SIGN UP</h1>
		<div id="wrapper_center">

			<form action="${pageContext.request.contextPath}/userRegistrationForm">
				<button>Sign up</button>
			</form>


		</div>
	</div>
	<div id="main">
		
	</div>

	<%@ include file="service/footerPage.jsp"%>