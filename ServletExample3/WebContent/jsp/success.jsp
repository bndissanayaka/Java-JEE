<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylesheet.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success View</title>
</head>
<body>
	<h1>Success Login</h1>
	<h2>
		<%
			String user = (String) request.getAttribute("username");
			out.print("Well Come " + user + " .....!!!!!!");
		%>
		You have Successful User Acccount for this System
	</h2>
</body>
</html>