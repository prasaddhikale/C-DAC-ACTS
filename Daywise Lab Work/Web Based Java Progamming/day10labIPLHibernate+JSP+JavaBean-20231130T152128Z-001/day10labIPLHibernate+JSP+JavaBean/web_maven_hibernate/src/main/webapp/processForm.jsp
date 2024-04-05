<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty property="*" name="uBean"/>
	<h2> -- >  ${sessionScope.uBean.addPlayer()}   < --</h2>
	<h3><a href ="index.jsp" > Go back</a></h3>
	
</body>
</html>