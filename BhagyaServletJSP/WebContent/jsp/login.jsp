<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login Screen</title>
</head>
<body>
	<h2>Sign in</h2>
	<form action="Submit.do" name="LoginForm" id="loginform" method="get">
		<table>
			<tbody>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username" id="uname"
						value="Please Enter UserName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password" id="pword"
						value="Please Enter Password" /></td>
				</tr>
			</tbody>
		</table>
		<br>
		<br>
		<p>Login Below</p>
		<input type="submit" name="Submit" id="submit" value="Submit" />&nbsp;&nbsp;
		<input type="reset" name="Reset" id="reset" value="Reset" />
	</form>

</body>
</html>