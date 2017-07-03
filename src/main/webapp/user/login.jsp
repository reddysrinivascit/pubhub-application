<!DOCTYPE html>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Login</title>
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
			<form action="../auth/login" method="post">
				<h1>Login</h1>
				<div>
					<input type="text" placeholder="Enter your Username" required
						name="username" />
				</div>
				<div>
					<input type="password" placeholder="Enter your Password" required
						name="password" />
				</div>
				<div>
					<input type="submit" value="Log in" />
				</div>
			</form>
			<div>
				Not a member yet ? <a href="../auth/register"><input
					type="submit" value="REGISTER HERE" /> </a>
			</div>
			<br> <a href="#">Forgot Password?</a><br>
			<div class="button"></div>
		</section>
	</div>
	
</body>
</html>