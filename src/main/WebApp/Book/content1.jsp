<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Times of india</title>
</head>
<body>
<form action="../book/list" method="POST">
	<table border = "1">
        <tr>
             <th>Author</th>
			<th>Publish Date</th>
			<th>Content</th>
			<th>Price</th>
			<th>Status</th>
			<th>cart</th>
		    <td>${book.author}</td>
			<td>${book.publishdate}</td>
			<td>${book.content}</td>
			<td>${book.price}</td>
			<td>${book.status}</td>
			</tr>
			<td>
			</table>
</form></body>
</html>