<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vote</title>
</head>
<body>
	<h3>${initParam.addTitle }</h3>
	<jsp:useBean id="vcb" class="jspapp.VoteBean"/>
	<jsp:setProperty property="candidateId" name="vcb" param="candidate"/>
	<jsp:setProperty name="vcb" property="userId" value="${lb.user.id}"/> 
	${vcb.voteCandidate() }
	Hello : ${lb.user.email}
    <c:choose>
    	<c:when test="${lb.user.status==0}">
    		${vb.votedCandidate()}
    	<br/><hr/>
    		Thank you For Voting!!!
    	</c:when>
    	<c:otherwise>
    		You Have Already Voted!!
    	</c:otherwise>
    </c:choose>
	
	<a href="logout.jsp">Sign Out</a>
	
</body>
</html>