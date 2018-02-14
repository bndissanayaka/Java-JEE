<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts 2 - Login Form</title>
<sb:head/>
<body>
	<h2>Struts 2 - Login Form</h2>
	<s:actionerror theme="bootstrap" />
	<s:form action="reg.action" enctype="multipart/form-data" theme="bootstrap" method="POST"
	cssClass="form-horizontal" label="A sample horizontal Form">
		<s:textfield name="RegNo" key="label.reg.no" size="20" />
		<s:textfield name="Name" key="label.Name" size="20" />
		<s:textfield name="Address" key="label.Address" size="20" />
		<s:textfield name="Tel" key="label.Tel" size="20" />
		<s:submit method="execute" key="label.login" align="center" />
		<s:submit cssClass="btn" />
	</s:form>
</body>
</html>