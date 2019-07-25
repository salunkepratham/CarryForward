<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	background-color:#badedd;
	height: 100vh;
}

#login .container #login-row #login-column #login-box {
	margin-top: 120px;
	max-width: 600px;
	height: 320px;
	border: 1px solid #9C9C9C;
	background-color: #EAEAEA;
}

#login .container #login-row #login-column #login-box #login-form {
	padding: 20px;
}

#login .container #login-row #login-column #login-box #login-form #register-link
	{
	margin-top: -85px;
}
h3 {
  color: white;
  text-shadow: 2px 2px 4px DodgerBlue;
}
h6 {
  color: white;
  text-shadow: 2px 2px 4px DodgerBlue;
}
body
{
  width: 100%;
  height: 100vh;
  background: url(resources/static/img/hero-bg.jpg) top center;
  background-size: cover;
  position: relative;

}
</style>
<title>Customer</title>
</head>
<body>
	<br>
	<br>
	 
	<div id="login">
		
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form" action="custlogin" method="post" modelAttribute="customer">
							<h3 class="text-center text-info">Login</h3>
							<div class="form-group">
								<label for="username" class="text-info">Username:</label><br>
								<input type="text" name="custEmail" id="username"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text-info">Password:</label><br>
								<input type="text" name="password" id="password"
									class="form-control">
							</div>
							<div class="form-group">
								 <input type="submit"
									name="submit" class="btn btn-info btn-md" value="submit">
							</div>
							<div>
								<center><h6><a href="register">New Registration</a></h6></center>							
							</div>
							<div id="register-link" class="text-right">
								
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>