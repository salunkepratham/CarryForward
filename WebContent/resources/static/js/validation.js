function validateform(){  
    var ck_name = /^[A-Za-z0-9 ]{3,20}$/;
	var ck_email = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i 
	var ck_username = /^[A-Za-z0-9_]{1,20}$/;
	var ck_password =  /^[A-Za-z0-9!@#$%^&*()_]{6,20}$/;
	var ck_mobile = /^[0-9]{10}$/;
	var ck_pincode =/^[0-9]{6}$/;
	var ck_address=/^[A-Za-z0-9]{15,150}$/;
	
	var name =document.myform.custFname.value;
	var lname =document. myform.custLname.value;
	var email =document. myform.custEmail.value;
	var password =document. myform.password.value;
	var mobile=document.myform.custMobile.value;
	var pincode = document.myform.custPincode.value;
	var address = document.myform.custAddress.value;
	// var gender = document.myform.gender.value;
	var errors = [];
 
 if (!ck_name.test(name)||!name) {
  errors[errors.length] = "Invalid Name .";
 }
 if (!ck_name.test(lname)||!lname) {
  errors[errors.length] = " Invalid Name .";
  }
if (!ck_password.test(password)||!password) {
  errors[errors.length] = "You must enter a valid Password ";
 }
  if (!ck_mobile.test(mobile)||!mobile) {
  errors[errors.length] = "You must enter a valid mobile no.";
 }
 if (!ck_pincode.test(pincode)||!pincode) {
  errors[errors.length] = "You must enter a valid PIN code.Must be 6 digit";
 }

 if (!ck_email.test(email)||!email) {
  errors[errors.length] = "You must enter a valid email address.";
 }
//  if (!ck_username.test(username)) {
//   errors[errors.length] = "You valid UserName no special char .";
//  }

//  if (gender==0) {
//   errors[errors.length] = "Select Gender";
//  }
	 if (errors.length > 0) {
	
	  reportErrors(errors);
	  return false;
	 }
  return true;
}

function reportErrors(errors){
 var msg = "Please Enter Valide Data...\n";
 for (var i = 0; i<errors.length; i++) {
 var numError = i + 1;
  msg += "\n" + numError + ". " + errors[i];
}
 alert(msg);
}