<%-- 
    Document   : viewtransaction
    Created on : 3 Aug, 2020, 4:15:03 PM
    Author     : MUTHINA
--%>

<%-- 
    Document   : accountbal
    Created on : 3 Aug, 2020, 7:36:45 AM
    Author     : MUTHINA
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="bank.retrieve"%>
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
		<table align="center" border="1" cellpadding="10">
			<tr>
					
                                        <th>From</th>
                                        <th>To</th>
                                        <th>Amount</th>
                                        <th>Time</th>
				
			</tr>

			<%
				List list = (List) request.getAttribute("list");
				Iterator it = list.iterator();
				while (it.hasNext()) {
					retrieve ud = (retrieve) it.next();
			%>
			<tr>
				
                                <td><%=ud.getSender()%></td>
                                <td><%=ud.getReceiver()%></td>
                                <td><%=ud.getAmount() %></td>
                                <td><%=ud.getDate()%></td>
			</tr>
			<%
				}
			%>



		</table>
		<!-- <div style="float: right">
			<img src="img/profile.jpg" height="150px"></img>
		</div> -->
	</div>
</body>
</html>

