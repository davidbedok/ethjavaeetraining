<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.ResourceBundle" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>:: Login ::</title>
</head>
<body>
	<% 
		ResourceBundle bundle = ResourceBundle.getBundle("messages", request.getLocale());
	
		String userName = (String) request.getAttribute("username"); 
		String errorMessage = (String) request.getAttribute("error"); 
	%>
	<form action="j_security_check" method="post">
		<fieldset>
			<legend><%= bundle.getString("login.header") %></legend>
			<div class="error"><%= errorMessage %></div>
			<div>
				<label for="username"><%= bundle.getString("login.username") %>: </label>
				<input type="text" name="j_username" id="username" value="<%= userName %>" class="loginfield" />
			</div>
			<div>
				<label for="password"><%= bundle.getString("login.password") %>: </label>
				<input type="password" name="j_password" id="password" />
			</div>
			<input type="submit" name="submit" value="<%= bundle.getString("login.submit") %>" class="loginfield" />
		</fieldset>
	</form>
</body>
</html>