<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Employee Form - Struts2 Demo</title>
<s:head />
</head>
<body>
	<h2>Employee Form</h2>
	<s:form action="employee" method="post" validate="true">
		<s:textfield name="name" key="name" size="20" />
		<s:textfield name="age" key="age" size="20" />
		<s:textfield name="email" key="email" size="20" />
		<s:textfield name="telephone" key="telephone" size="20" />
		<s:submit method="addEmployee" key="label.add.employee" align="center" />
	</s:form>
</body>
</html>