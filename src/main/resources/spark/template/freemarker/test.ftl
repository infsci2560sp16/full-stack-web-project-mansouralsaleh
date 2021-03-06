<!DOCTYPE html>

<html>

<head>
<meta charset='utf-8'>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Tabadul Book Exchange website!</title>
<link rel="stylesheet" type="text/css" href="./stylesheets/mainsheet1.css">
<script src="./js/javascript.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
</head>

<body onload="init();">
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
 <div class="row top" id="beforeContent">

</div>
	<div class="row" id="row0">
		<div class="col-1 col-m-1 colxmv books left">
		</div>
		
		
		<div class="col-u col-m-u colu books 1" id="0">
			<a href="book.html?id=1">
			<img src="images/${img}" alt="Engineering Psychology and Human Performance">
			<h2>${name}</h2>
			<h3>${uni}</h3>
			<h4>${course}</h4>
			</a>
		</div>
		<div class="col-u col-m-u colu books 1" id="0">
			<a href="book.html?id=2">
			<img src="images/${img2}" alt="Engineering Psychology and Human Performance">
			<h2>${name2}</h2>
			<h3>${uni2}</h3>
			<h4>${course2}</h4>
			</a>
		</div>
		
		</div>
		
		
		
		
<div class="row footer" id="footer">
  <div class="col-6 col-m-6 footerCenter">
		<h2>Tabadul</h2>
		<h3 class="saudihouse">The Saudi House in Pittsburgh</h3>
		<h3 class="saudiemail">saudi.n.pitt@gmail.com</h3>
  </div>
  <div class="col-6 col-m-6 ">
		
		<h3>What is Tabadul?</h3>
		<p>Tabadul (The Arabic word for exchange as this website will provide books exchange services) 
			is a service provided by the Saudi House in Pittsburgh. This service help Saudi students exchange books among each other.</p>
		<h3>Who we are?</h3>
		<p>The Saudi House in Pittsburgh, which is a non-profit organization that act as a supervisory organization to the Saudi Clubs in all the different universities in Pittsburgh, have been serving saudi students and families living in the greater pittsburgh area for years. </p>
  </div>
  </div>


</body>

</html>