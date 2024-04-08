<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>Employee No</th>
			<th>Name</th>
		</tr>

		<c:forEach var="employee" items="${requestScope.filterEmployee}">
			<tr>
				<td>${employee.empNo}</td>
				<td>${employee.firstName} ${employee.lastName}</td>
			</tr>
		</c:forEach>


	</table>
	<spring:url var="url" value="/"></spring:url>
	<a href="${url}">go to home page</a>
</body>
</html>