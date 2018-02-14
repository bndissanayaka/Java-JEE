<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<h2>Struts 2 - Register Application</h2>
	<s:actionerror />
	<s:form action="register" method="post">
	<s:textfield name="fname" key="fname"/>
	<s:textfield name="lname" key="lname"/>
	<s:textarea name="gender" key="gender"/>
	<s:textfield name="dateOfBirth" key="DOB" />
	<s:number name="age" />
	<s:submit method="execute" key="register" align="center" />
	</s:form>
	
	
</body>
</html>