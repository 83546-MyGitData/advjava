<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Beans</title>
</head>
<body>
	<jsp:useBean id="rb" class="jspapp.RegistrationBean"/>
	<jsp:setProperty name="rb" property="firstName" param="first_name"/>
	<jsp:setProperty name="rb" property="lastName" param="last_name"/>
	<jsp:setProperty name="rb" property="email" param="email"/>
	<jsp:setProperty name="rb" property="password" param="passwd"/>
	<jsp:setProperty name="rb" property="birthDate" param="dob"/>
	
	<% if(rb.registration()!=0) { %>
		Register successfully, <jsp:getProperty name="rb" property="email" />
	<% } else { %>
		Registration Failed.
	<% } %>

</body>
</html>