<%-- 
    Document   : transfer
    Created on : 3 Aug, 2020, 7:48:51 AM
    Author     : MUTHINA
--%>
<%-- 
    Document   : viewbal
    Created on : 2 Aug, 2020, 5:49:07 PM
    Author     : MUTHINA
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="bank.UserDetails"%>
<%@ include file="usermenu.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center"
		style="background-color: white; min-height: 480px">
		<br> <br>
		<form action="transfer" method="post">
			<h2 style="color: #4F94CD"></h2>
			<table>
				<tr>
					<td>
						<table cellpadding="8">
							<tr>
								<%--<td style="color: #3b5998" align="center">Enter Account Number:</td>
								<td><input type="text" name="acno" align="center" Required></td> --%>
                                                                <td style="color: #3b5998" align="center">Enter Receiver Account Number</td>
								<td><input type="text" name="rcv" align="center" Required></td>
							</tr>
							<tr align="center">
								<td colspan="2">
								<input type="submit" value="Transfer" style="background-color: #69a74e;border-color: #69a74e;border-radius: 3px;width: 150px;padding: 5px;text-align: center;color: #fff">
								</tr>
						</table>
		<!-- <div style="float: right">
			<img src="img/profile.jpg" height="150px"></img>
		</div> -->
	</div>
</body>
</html>





