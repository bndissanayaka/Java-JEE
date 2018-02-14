<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylesheet.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<div style="color: red">
		<html:errors />
	</div>
	<html:form action="/Login">
		<h1 align="center">Login Page</h1>
		<table border="2" cellpadding="1">
			<tbody>
				<tr>
					<td>User Name</td>
					<td><html:text name="LoginForm" property="userName" size="20" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><html:password name="LoginForm" property="password"
							size="20" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><html:submit value="Login" />&nbsp;&nbsp;<html:reset
							value="Reset" /></td>
				</tr>
			</tbody>
		</table>
	</html:form>
</body>
</html>