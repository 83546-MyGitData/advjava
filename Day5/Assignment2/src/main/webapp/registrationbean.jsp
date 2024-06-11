<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Beans</title>
</head>
<body>
	<h3>${initParam.addTitle }</h3>
	<jsp:useBean id="rb" class="jspapp.RegistrationBean" scope="session"/>
	<jsp:setProperty name="rb" property="*" />
	<jsp:setProperty name="rb" property="status" value="0"/>
	<jsp:setProperty name="rb" property="role" value="voter"/>
	${rb.registerUser()}
	<c:choose>
		<c:when test="${rb.count==1 }">
			Registration successful
			<a href="index.jsp">Sign In</a>
		</c:when>
		<c:otherwise>
			Registration failed
			<a href="newUser.jsp">Sign Up</a>
		</c:otherwise>
	</c:choose>

</body>
</html>