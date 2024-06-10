<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<h2>Registration</h2>
	<form method="post" action="registrationbean.jsp">
		First Name: <input type="text" name="first_name"> <br/><br/>
		Last Name: <input type="text" name="last_name"> <br/><br/>
		Email: <input type="text" name="email"/> <br/><br/>
		Password: <input type="password" name="passwd"/> <br/><br/>
		Date of Birth: <input type="date" name="dob"> <br/><br/>
		<br/>
		<br/>
		<input type="submit" value="Sign Up"/>
		Already have an account? <a href="index.jsp">Sign In Here</a>
		
	</form>

</body>
</html>