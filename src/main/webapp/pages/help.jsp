<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>help page</title>
</head>
<body>

	<%
		String name = (String)request.getAttribute("name");
		Integer rollNumber = (Integer)request.getAttribute("rollNumber");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	%>

	<h1>Hello, My name is <%=name %></h1>
	<h1>This is help page</h1>
	<h1>My roll number is <%=rollNumber %></h1>
	<h1>Date and Time is <%=time.toString() %></h1>
</body>
</html>