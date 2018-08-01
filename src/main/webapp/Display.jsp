<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" import="com.axelor.app.db.Contact" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Contacts</title>
</head>
<body>
	<table border="1">
	  <tr>
		<td>ContactID</td>
		<td>Contact Name</td>
		<td>Contact Number</td>
		<td colspan="2" align="center">Action</td>
	 </tr>
	<c:forEach items="${contactList}" var="contact">
		<tr>
			<td>${contact.id}</td>
			<td>${contact.name}</td>
			<td>${contact.number}</td>
			<td><a href="/contactbook/display/${contact.id}"><input type="button" value="Edit"></a></td>
			<td><a href="/contactbook/delete/${contact.id}"><input type="button" Value="Delete"></a></td>
		</tr>	
	</c:forEach>	
	</table>
	<br/>
	<a href="/contactbook/">Home page</a>
		
</body>
</html>