<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Create Your Account --- Tabadul</title>
<link rel="stylesheet" type="text/css" href="./stylesheets/mainsheet1.css">
<script src="./js/javascript.js"></script>

</head>

<body onload="init();init2();">
<a href="index.html" title="Tabadul Book exchange services">
<div class="logo">
<!--Background image of banner taken and changed from amazon.com -->
</div>
</a>
<div class="row SearchBar">
<!--This search input bar design was adapted from http://webdesign.tutsplus.com/tutorials/css-experiments-with-a-search-form-input-and-button- -cms-22069-->
  <div class="col-2 col-m-3 login">
  <div  onclick="location.href='byUni.html';">
  <p class="signin">Browse by</p>
  <p class="createAccount">University</p>
  </div>
  </div>
  <div class="col-8 col-m-6 container-1">
      
      <input type="search" id="search" placeholder="Search..." />
  </div>
  
  <div id="SignIn" class="col-2 col-m-3 login">
  <div >
  <p class="signin">Sign in, Or</p>
  <p class="createAccount">Create Account</p>
  </div>
</div>
</div>

<div class="row">

  <div class="col-4 col-m-5 sign" id="sign">
	<form action="#" method="post">
 <input class='Loginform'  placeholder='Enter Username' type='text' pattern="[A-Za-z]*" title="Name can only include letters" required ><br>
  <input class='Loginform'  placeholder='Enter Password' type='password'	required><br>
  <div class="signinButton"><input type="submit" class="btn" value="Sign In"><a href="myaccount.html" class="btn">Reset Password</a></div>
</form>
<h2><span>OR</span></h2>
<form action="registration.html" method="get">
<div class="createAccountButton"><input type="submit" class="btn" value="Create Account"></div>
</form>
  </div>
 </div>
 <div class="row top">

</div>
<div class="row">
  <div class="col-2 col-m-1 space">
  </div>
  
  <div class="col-8 col-m-10 formContainer">
  <form action="User" method="post">
	  <div class="formheader">
		<h1> Registration Form</h1>
	  </div>
	  
	  <div class="row form">
		  <label for="title" class="col-4 col-m-4 formLabel">Name</label>
		  
		  <div class="col-2 col-m-2 formDivs">
			  <select id="title" class='registrationForm' >
								<option>Mr</option>
								<option>Ms</option>
								<option>Mrs</option>
								<option>Miss</option>
				</select>
		  </div>
		  
		  <div class="col-3 col-m-3 formDivs" >
			<input class='registrationForm'  placeholder='First Name' type='text' pattern="[A-Za-z]*" title="Name can only include letters" required autofocus>
		  </div>
		  <div class="col-3 col-m-3 formDivs">
			<input class='registrationForm'  placeholder='Last Name' type='text' pattern="[A-Za-z]*" title="Name can only include letters" required>
		  </div>
	  </div>
	  
	  <div class="row form">
		<label for="email" class="col-4 col-m-4 formLabel lableContact">Contact Information</label>

		<div class="col-8 col-m-8 formDivs" >
			<input id="email" class='registrationForm'  placeholder='Educational Institute Email' type='email' pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.edu"
				title="Email must be from an educational institute and follow this format: email@example.edu" required>
		</div>
		<div class="col-8 col-m-8 formDivs">
			<input class='registrationForm'  placeholder='Verify Email' type='email' required>
		</div>
		<div class="col-8 col-m-8 formDivs">
			<input class='registrationForm'  placeholder='Cell Phone Number' type='tel' required>
		</div>
	  </div>
	  
	  <div class="row form">
		<label for="password1" class="col-4 col-m-4 formLabel lableContact">Password</label>

		<div class="col-8 col-m-8 formDivs" >
			<input id="password1" class='registrationForm'  placeholder='Verify Password' type='password' pattern="(?=.*\d)(?=.*[A-Za-z]).{8,}"
title="Must contain at least one number and one letter, and at least 8 or more characters"	required>
		</div>
		<div class="col-8 col-m-8 formDivs">
			<input class='registrationForm' id="password2" placeholder='Re-Enter Password' type='password' required>
		</div>
	  </div>
	  
	  <div class="row form">
		<label for="school" class="col-4 col-m-4 formLabel lableContact">Additional Information</label>

		<div class="col-8 col-m-8 formDivs" >
			<input id="school" class='registrationForm'  placeholder='School Name' type='text'>
		</div>
		<div class="col-8 col-m-8 formDivs">
			<input class='registrationForm'  placeholder='Major' type='text'>
		</div>
	  </div>
	  <div class="row form">
		<label for="bio" class="col-4 col-m-4 formLabel lableContact">Biography</label>

		<div class="col-8 col-m-8 formDivs" >
			<textarea id="bio" class='registrationForm' rows='10' ></textarea>
		</div>
		
	  </div>
	  <div class="signUpDiv">
		<input type="submit" class = "btn" value="Sign Up" class="signUp">
	  </div>
	  </form>
  </div>
  
  <div class="col-2 col-m-1 space">
  </div>
  
</div>
</br>
<div class="row footer">
  <div class="col-6 col-m-6 footerCenter">
  <#list aboutpart as part>
		${part}
	</#list>
		</div>
  </div>
</body>

</html>