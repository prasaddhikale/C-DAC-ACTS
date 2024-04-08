<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>employee List</h2>

<table border="1">
    <tr>
        <th>Employee Number</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Company</th>
        <th>City</th>
    </tr>

    <c:forEach var="employee" items="${requestScope.listOfEmp}">
        <tr>
            <td>${employee.empNo}</td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
            <td>${employee.companyName}</td>
            <td>${employee.city}</td>
        </tr>
    </c:forEach>
</table>

	<spring:url var="url" value="/"></spring:url>
	<a href="${url}">go to home page</a>
</body>
</html>