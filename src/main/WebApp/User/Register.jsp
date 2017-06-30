<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to Book REGISTER</h1>
	<form action="../auth/adduser" method="get">
		<h3>REGISTER</h3>
		<input type="text" name="id" placeholder=" enter id" required></br>
	     <input type="text" name="name" placeholder="enter name" required></br>
		<input type="text" name="username" placeholder="enter username" required></br> 
			<input type="passward" name="passward" placeholder="enter passward" required></br>
			<input type="text" name="mobile_no" placeholder="enter mobile_no" required></br>
			<input type="text" name="email_id" placeholder="enter email_id" required></br>
			<input type="text" name="active" placeholder="enter active" required></br>
			<input type="text" name="role" placeholder="enter role" required></br>
		<button type="submit">Register</button>
		<br>
	</form>
</body>
</html>