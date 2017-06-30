<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books Details</title>
</head>
<body>
<form action="../book/list" method="POST">
<h2>Welcome to book Management - List of Books Available</h2>
	<table border = "1">
	<tr>
			<th>ISBN</th>
			<th>Title</th>
			
			
		</tr>
		<c:forEach items="${book}" var="book">
		<tr>	
			<td>${book.isbn}</td>
			<td>${book.title}</td>
			
			<td><a href="../book/${book.isbn}">View</a></td>
		</tr>
		
		</c:forEach>
	</table>
</body>
</html>