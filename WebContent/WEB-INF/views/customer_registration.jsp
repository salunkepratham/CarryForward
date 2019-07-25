<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="./resources/static/js/validation.js"></script>
<title>Insert title here</title>
</head>
<body>
<head>
<title> Registration Page </title>
		<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
		<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<!------ Include the above in your HEAD tag ---------->
	</head>


<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">


<div class="container">
		<div class="jumbotron">
   			<center> <h1> Customer Registration Form </h1> </center>    
  		</div>
  	
	<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">
	
			<p class="divider-text">
      
   			</p>
    
	<form name ="myform" action="add" method="Post" modelAttribute="customer" onsubmit="return validateform()?true:false">
		<div class="form-group input-group">
		
       		 <input name="custFname" class="form-control" placeholder="First name"
					type="text" >
      		 <input name="custLname" class="form-control" placeholder="Last name"
					type="text" >
    	</div> <!-- form-group// -->
    
   <!-- <div class="form-group input-group">
    	  <label> Gender </label>
		  <input type="radio" class="form-control" name="gender" value="male"> Male<br>
  		  <input type="radio" class="form-control" name="gender"
					value="female"> Female	
   		</div>--> 
   		
    <div class="form-group input-group">
        <input name="custEmail" class="form-control" placeholder="Email address"
					type="email" >
    </div> <!-- form-group// -->
    <div class="form-group input-group">
        <input name="password" class="form-control" placeholder="Password"
					type="text" >
    </div> <!-- form-group// -->
    
    <div class="form-group input-group">
    	<input name="custMobile" class="form-control" placeholder="Phone number"
					type="text">
    </div> <!-- form-group// -->
    
    <div class="form-group input-group">
    	<input name="custAddress" class="form-control" placeholder="Address" type="text">
    </div>
    
    <div class="form-group input-group">
    	<input class="form-control" placeholder="Pin Code" type="text" name="custPincode">
    </div>
    
        <button type="submit" class="btn btn-primary btn-block" value="Submit"> Create Account  </button>
    
	</div> <!-- form-group// -->      
                                                        
</form>
</article>
</div> <!-- card.// -->

</div> 
<!--container end.//-->

<br>
<br>

</article>
</body>

</html>