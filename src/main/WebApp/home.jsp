<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to Book _login</h1>
	<form action="../auth//login" method="POST">
		<h3>login</h3>
		<input type="text" name="username" placeholder="enter username" required><br> 
			<input type="password" name="password" placeholder="enter password" required><br>
		<button type="submit">login</button>
		<a href= "../auth/Register">Register</a>
		<br>
	</form>
</body>
</html>