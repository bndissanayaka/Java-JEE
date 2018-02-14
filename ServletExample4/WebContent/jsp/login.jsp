<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylesheet.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Screen</title>
<script type="text/javascript" src="/javascript/valid.js"></script>
</head>
<body>
	<h3>Login Page</h3>
	<p>Please enter your username and password to login.<br> Once successfully logged in you will be able to register if you are not already registered.</p>
	<form action="Hello.do" name="Login" id="login" method="get" onsubmit="return checkInput()">
		<table border="1" cellpadding="5">
			<tbody>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname" id="u_id"
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pword" id="pid"
						value="" size="30"></td>
				</tr>
			</tbody>
		</table>
		<h4>
			Login <input type="submit" name="submit" value="Submit" id="submit"/>
			&nbsp;&nbsp; Reset <input type="reset" name="reset" value="Reset" />
		</h4>
	</form>
</body>
</html>