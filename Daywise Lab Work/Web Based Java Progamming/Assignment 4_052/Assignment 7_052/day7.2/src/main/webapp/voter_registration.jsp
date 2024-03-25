<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Voter Registration</title>
</head>

<%--transfer clnt's conversation state to JB  / invoke all setters--%>
<jsp:setProperty property="*" name="user"/>
<%--Invoke B.L from JB --%>
<h4>Status : ${sessionScope.user.registerNewVoter()}</h4> 
<body>	
</body>
</html>