
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ConsignmentBooking</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style type="text/css">
body {
	width: 100%;
	height: 100vh;
	background: url(../img/hero-bg.jpg) top center;
	background-size: cover;
	position: relative;
}
h6 {
  color: white;
  text-shadow: 2px 2px 4px DodgerBlue;
}
</style>
</head>


<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">


<div class="container">
	<div class="jumbotron">
		<center>
			<h1>Consignment Booking Form</h1>
		</center>
	</div>

	<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">

		<p class="divider-text"></p>

		<form action="consignment" method="Post" modelAttribute="consignment">
			<h3>Source Details :</h3>
			<div class="form-group input-group">
		
       		 <input name="sourceFname" class="form-control" placeholder="First name"
					type="text" >
      		 <input name="sourceLname" class="form-control" placeholder="Last name"
					type="text" >
    	</div>
    	<div class="form-group input-group">
    	<input name="sourceMobile" class="form-control" placeholder="Phone number"
					type="text">
   		 </div>
			<!-- form-group// -->
			<div class="form-group input-group">
				<input name="sourceAddress" class="form-control" placeholder="Source Address"
					type="text" style="width:300px">
			</div>
			<h3>Destination Details :</h3>
				<div class="form-group input-group">
		
       		 <input name="destFname" class="form-control" placeholder="First name"
					type="text" >
      		 <input name="destLname" class="form-control" placeholder="Last name"
					type="text" >
    	</div>
    	<div class="form-group input-group">
    	<input name="destMobile" class="form-control" placeholder="Phone number"
					type="text">
   		 </div>
			<div class="form-group input-group">
				<input name="destAddress" class="form-control" placeholder="Destination Address"
					type="text" style="width:300px">
			</div>
			<!-- form-group// -->

			<div class="form-group input-group">
			     <select>
				        <option value="conServiceBranch">Select Service Branch</option>
				        <option value="mumbai">Mumbai</option>
				        <option value="pune">Pune</option>
				        <option value="kolhapur">Kolhapur</option>
				         <option value="latur">Latur</option>
				        <option value="nagpur">Nagpur</option>
				        <option value="nashik">Nashik</option>
			     </select>
			</div>
			<div class="form-group input-group">
			     <select>
				        <option value="deliveryType">Select Delivery </option>
				        <option value="normal">Normal</option>
				        <option value="faster">Faster</option>				        		        
			     </select>
			</div>
			<div class="form-group input-group">
        	<input name="consEmail" class="form-control" placeholder="Email address"
					type="email" >
    		</div>
			<!-- form-group// -->

			<!--<div class="form-group input-group">
				<input class="form-control" placeholder="Payment" type="text">
			</div>-->

			<!--<div class="form-group input-group">
				<input class="form-control" placeholder="Feedback" type="text">
			</div>-->

			<!--  <div class="form-group input-group">
				<input name="" class="form-control" placeholder="Status"
					type="Status">
			</div>-->
			<!--  <center><h6><a href="customer_registration">Create Account</a></h6></center>-->
			<!-- <button type="submit" class="btn btn-primary btn-block">
				Create Account</button> -->
			<button type="submit" class="btn btn-primary btn-block"> Book Consignment  </button>
			<button type="reset" class="btn btn-primary btn-block">Reset </button>
	</div>
	<!-- form-group// -->
	<!--  <p class="text-center">
		Have an account? <a href="">Log In</a>
	</p>-->
	</form>
	</article>
</div>
<!-- card.// -->

</div>
<!--container end.//-->

<br>
<br>

</article>
</html>