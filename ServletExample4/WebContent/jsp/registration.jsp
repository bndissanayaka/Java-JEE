<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylesheet.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <script type="text/javascript" src = "/javascript/regValidation.js"></script> -->
</head>
<body>
<h3>Registration Page</h3>
	<form action="Register.do" name="Login" id="login" method="get">
	<!-- onsubmit="return validRegData()" -->
		<table border="1" cellpadding="5">
			<tbody>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname" id="fn"
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" id="ln"
						value="" size="30"></td>
				</tr>
				<tr>
					<td>Student Id</td>
					<td><input type="text" name="sId" id="sid"
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>NIC No</td>
					<td><input type="text" name="nic" id="nic"
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" id="age"
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td><input type="text" name="dob" id="dob"  
						value="yyyy/mm/dd" size="30" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="addrs" id="addrs"  
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>Telephone No</td>
					<td><input type="text" name="telNo" id="tel"
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><input type="text" name="cntry" id="cntry"
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" id="city"
						value="" size="30" /></td>
				</tr>
				<tr>
					<td>Other</td>
					<td><input type="text" name="other" id="other"
						value="" size="30" /></td>
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