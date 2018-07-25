<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to contactbook</title>
</head>
<body>
	<form action="contact/createNewContact" method="post" enctype="application/json">
		<table>
			<tr>
			<td>Enter Contact Details:</td>
			</tr>
			<tr>
			<td>Enter Name : </td>
			<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
			<td>Enter Number : </td>
			<td><input type="text" name="number" id="number"></td>
			</tr>	
			<tr>
			<td><input type="submit" value="Save"></td>
			</tr>	
		</table>
	</form>
	<h2>Delete Contact</h2>
	<form action="contact/deleteContact" method="post">
		<table>
			<tr>
			<td>Enter ID : </td>
			<td><input type="text" name="id"></td>
			</tr>
			<tr>
			<td><input type="submit" value="Delete"></td>
			</tr>	
		</table>
	</form>
	<h2>Update Contact</h2>
	<form action="contact/updateContact" method="post">
		<table>
			<tr>
			<td>Enter name : </td>
			<td><input type="text" name="name"></td>
			</tr>
			<tr>
			<td>Enter number : </td>
			<td><input type="text" name="number"></td>
			</tr>
			<tr>
			<td><input type="submit" value="Update"></td>
			</tr>	
		</table>
	</form>	
	<h2>Display Contact</h2> 
	<form action="contact/displayContact" method="post">
	   <table>
	   	<tr>
	   		<td>Enter ID :</td>
	   		<td><input type="text" name="id"></td>
	   	</tr>
	   	<tr>
	   		<td><input type="submit" value="submit"></td>
	   	</tr>	   	
	   </table>
	</form>
	<h2>Display all contacts</h2>>
	<a href="contact/displayAllContact">View Contacts</a>	
</body>
</html>