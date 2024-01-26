<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>help page</title>
</head>
<body>

	<h1>Hello, My name is ${name}</h1>
	<h1>This is help page</h1>
	<h1>My roll number is ${rollNumber}</h1>
	<h1>Date and Time is ${time }</h1>
	<hr>
	<c:forEach var="item" items="${marks}">
		<h1>${item}</h1>
		<h3><c:out value="${item}"></c:out></h3>
	</c:forEach>
</body>
</html>