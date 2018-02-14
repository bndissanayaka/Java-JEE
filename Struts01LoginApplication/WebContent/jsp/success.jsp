<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page!!!!</title>
</head>
<body>
 <h1>Login Success!!!!!! Welcome <bean:write name = "LoginForm" property="userName"></bean:write></h1>
</body>
</html>