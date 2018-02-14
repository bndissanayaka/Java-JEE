<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylesheet.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h2>Input Your Detail</h2>
	<form action="Hello.do" method="post">
		<table border="2" cellpadding="1">
			<tbody>
			    <tr>
					<td>Id</td>
					<td><input type="text" name="id" value="" size="30" /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" value="" size="30" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname" value="" size="30" /></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="text" name="salary" value="" size="30" /></td>
				</tr>
				
			</tbody>
		</table>
		<br> <br> <br>
		<h2>
			Click Hear &nbsp;&nbsp; <input type="submit" value="Submit"
				name="submit" />&nbsp;&nbsp; <input type="reset" value="Reset"
				name="reset" />
		</h2>
	</form>
</body>
</html>