<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<jsp:useBean  id ="uBean" class="beans.UserBean" scope="session"/>
<body>
<form action="processForm.jsp" method="post">
      <table style="background-color: lightgrey; margin: auto">
        <tr>
        <td><label for='teamName'>Select a team</label></td>
        <td>
        	<select name = 'teamAbbr' id='ap'>
        		<c:forEach items="${uBean.showTeamAbbr()}" var="item">
        			<option value="<c:out value="${item}" />"><c:out value="${item}" /></option>
  				</c:forEach>
  			</select>
        </td>
        </tr>
        <tr>
          <td>Enter First Name</td>
          <td><input type="text" name="firstName" /></td>
        </tr>
        <tr>
          <td>Enter Last Name</td>
          <td><input type="text" name="lastName" /></td>
        </tr>
        <tr>
          <td>Enter dob</td>
          <td><input type="date" name="dob"  /></td>
        </tr>
        <tr>
          <td>Enter Batting Average</td>
          <td><input type="text" name="battingAvg" /></td>
        </tr>
        <tr>
          <td>Enter Wickets Taken</td>
          <td><input type="number" name="wicketsTaken" /></td>
        </tr>
        <tr>
          <td><input type="submit" value="Register" /></td>
        </tr>
      </table>
    </form>
</body>
</html>