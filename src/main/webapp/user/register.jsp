<!DOCTYPE html>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="UTF-8">
<title>New User Registration</title>
<link rel="stylesheet" href="../login/css/style.css" />
<script src="../login/js/index.js"></script>

<link id="theme" rel="stylesheet" type="text/css" href="style.css"
	title="theme" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="http://fonts.googleapis.com/css?family=Roboto+Condensed|Roboto+Condensed|Droid+Sans|Droid+Sans|Droid+Sans|Droid+Sans" />" />
<script type="text/javascript" lang="javascript"
	src="js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" lang="javascript" src="../js/scripts.js"></script>
<script type="text/javascript" lang="javascript" src="../js/theme.js"></script>
<script type="text/javascript" lang="javascript" src="../js/custom.js"></script>
</head>
<body>
	<header>
		<div id="top">
			<div class="bg"></div>
			<div class="row">
				<div id="logo"></div>
				<nav>
					<div id="hmenu">
						<ul>
							<li><a href="/">Home</a></li>
							<li><a href="/book">Book</a></li>
						</ul>
					</div>
				</nav>
				<div class="clear"></div>
			</div>
		</div>
	</header>
	<div class="container">
		<section id="content">
			<form action="../auth/register" method="post">
				<h1>Register</h1>
				<div>
					<input type="text" placeholder="Enter your Name" required
						name="name" />
				</div>
				<div>
					<input type="text" placeholder="Enter your Username" required
						name="username" />
				</div>
				<div>
					<input type="password" placeholder="Enter your Password" required
						name="password" />
				</div>
				<div>
					<input type="tel" name="mobileNumber"
						placeholder="Enter Mobile Number" />
				</div>
				<div>
					<input type="email" name="emailID" placeholder="Enter Email ID" />
				</div>
				<div>
					<select name="roleID">
						<option value=0>Choose Role ID</option>
						<option value=100>Admin</option>
						<option value=200>Author</option>
						<option value=300>User</option>
					</select>
				</div>
				<div>
					<input type="submit" value="Register" />
				</div>
			</form>
			<div class="button"></div>
		</section>
	</div>
	<footer id="footer">
		<div class="bg"></div>
		<div class="content">
			<div class="group">
				<div class="col span_1_of_3">
					<h2>Links</h2>
					<div class="vmenu">
						<ul>
							<li><a href="https://github.com/Judesharan">Github</a></li>
							<li><a href="https://github.com/Judesharan">Wordpress</a></li>
						</ul>
					</div>
				</div>
				<div class="col span_1_of_3">
					<h2>About Me</h2>
					<p>My name is Jude Sharan. I am a budding engineer and an
						aspiring programmer who takes up the challenge at any time. I try
						my level best to excel in every field that I'm into. I'm now on a
						journey to become a full stack web developer.</p>
				</div>
				<div class="col span_1_of_3">
					<h2>Contact</h2>
					<p>
						Jude Sharan <br /> 267, I Street, Sri Vinayaga Nagar, <br />
						Kamarajapuram, Anakaputhur, <br /> Chennai - 600 070.
					</p>
				</div>
			</div>
			<div class="clear"></div>
			<div class="baseline">
				<div style="float: left; margin-top: 7px">
					<p>Copyright - 2017 - Jude Sharan J | All Rights Reserved |</p>
				</div>
				<ul class="social-links" style="float: right">
					<li><a href="#" rel="nofollow"
						style="background-image: url('images/facebook.png')"
						title="Be a fan on Facebook"></a></li>
					<li><a href="#" rel="nofollow"
						style="background-image: url('images/twitter.png')"
						title="Follow us on Twitter"></a></li>
					<li><a href="#"
						style="background-image: url('images/googleplus.png')"
						title="Circle us on Google+"></a></li>
					<li><a href="#" rel="nofollow"
						style="background-image: url('images/rss.png')" title="RSS Feed"></a>
					</li>
				</ul>
				<div class="clear"></div>
			</div>
		</div>
	</footer>
</body>
</html>