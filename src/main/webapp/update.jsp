<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Contact</title>
</head>
<body>
	<form method="post" action="/contactbook/updateContact">
		<table align="center">
		<tr>
		<td Colspan="2">Update Contact</td>
		</tr>
		<tr>
		<td>Enter ID : <input type="text" name="id" value="${contact.id}"></td>
		</tr>
		<tr>
		<td>Enter Name : <input type="text" name="name" value="${contact.name}"></td>
		<tr>
		<td>Enter Number : <input type="text" name="number"value="${contact.number}"></td>
		</tr>
		<tr>
		<td><input type="submit" value="Update"></td>
		</tr>
		</table>
	</form>

</body>
</html>