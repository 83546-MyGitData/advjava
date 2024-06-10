<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h2>Login</h2>
	<form method="post" action="loginbean.jsp">
		Email: <input type="text" name="email"/> <br/><br/>
		Password: <input type="password" name="passwd"/> <br/><br/>
		Don't have an account? <a href="candlist.jsp">Register Here</a> 
		<br/>
		<br/>
		<input type="submit" value="Sign In"/>
	</form>
</body>
</html>