<%-- 
    Document   : index
    Created on : 2 Aug, 2020, 4:41:49 PM
    Author     : MUTHINA
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="loginvalid" method="post">
    <h3 align="center">  Welcome to online banking</h3>
    <table cellpadding="8" align="center">
                                
				<tr>
					<td>Username:</td>
					<td><input type="text" name="name"
						style="padding: 10px; width: 300px"
						placeholder="User Name"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" id="pwd"
						style="padding: 10px; width: 300px" placeholder="Account Number"></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="submit" value="Login"
						style="background-color: #69a74e; border-color: #69a74e; border-radius: 3px; width: 150px; padding: 5px; text-align: center; color: #fff">
					</td>
				</tr>
			</table>
</body>
</html>
