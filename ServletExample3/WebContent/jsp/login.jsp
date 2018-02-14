<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylesheet.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Screen</title>
<script type="text/javascript">
	function validateForm() {
		var username = document.getElementById("uername").value;
		var password = document.getElementById("password").value;
		//var username=document.login.username.value;
		//var password=document.login.password.value;
		if (username == null || username == "" || password == null
				|| password == "") {
			if (username == null || username == "") {
				alert("Please Enter User Name");
			} else {
				alert("Please Enter Password");
			}
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<h2>Sign in</h2>
	<form action="Hello.do" name="login" id="login" method="post"
		onSubmit="return validateForm()">
		<table border="2" cellpadding="1">
			<tbody>
				<tr>
					<td>User Name</td>
					<td><input type="text" id="uername" name="username" value=""
						size="60" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" id="password" name="password"
						value="" size="60" /></td>
				</tr>
			</tbody>
		</table>
		<br> <br> <br>
		<h2>
			Login <input type="submit" value="Submit" name="submit" />&nbsp;&nbsp;
			<input type="reset" value="Reset" name="reset" />
		</h2>
	</form>
</body>
</html>