<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylesheet.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Successfully</title>
</head>
<body>
	<h2>Registration Successfully</h2>
	<h3>
		<%
			String name = (String) request.getAttribute("full_name");
			out.print("WellCome..." + name);
		%>
	</h3>
</body>
</html>