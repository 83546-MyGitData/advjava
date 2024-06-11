<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Candidate</title>
</head>
<body>
	<h3>${initParam.addTitle }</h3>
	<jsp:useBean id="dcb" class="jspapp.DeleteCandidateBean"/>
	<jsp:setProperty name="dcb" property="id" param="id"/>
	${dcb.deleteCandidate() }
	<c:choose>
		<c:when test="${dcb.count==1 }">
			Deleted Successfully.
			<c:redirect url="result.jsp"/>
		</c:when>
		<c:otherwise>
			Candidate Delete Failed. <br/><br/>
			<a href="result.jsp">Show Result</a>
		</c:otherwise>
	</c:choose>
	
	
</body>
</html>