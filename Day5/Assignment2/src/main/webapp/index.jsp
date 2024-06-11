<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h3>${initParam.appTitle}</h3>
	<form method="post" action="loginbean.jsp">
		Email: <input type="text" name="email"/> <br/><br/>
		Password: <input type="password" name="passwd"/> <br/><br/>
		Don't have an account? <a href="newUser">Register Here</a> 
		<br/>
		<br/>
		<input type="submit" value="Sign In"/>
	</form>
</body>
</html>