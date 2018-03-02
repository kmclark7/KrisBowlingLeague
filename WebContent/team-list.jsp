<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>League Information</title>
</head>
<body>	
<h1>Best Bowling League - Team List</h1>
<form method = "post" action = "TeamOptionsServlet">
		<table style="width: 70%">
			<tr>
				<th style="text-align: center; width: 8%">Select</th>
				<th style="text-align: left; width: 20%">Team Name</th>
				<th style="text-align: left; width: 15%">Team Type</th>
				<th style="text-align: left; width: 15%">Preferred Night</th>	
			</tr>
			<c:forEach items = "${requestScope.allTeams}" var = "currentTeam">
			<tr>
				<td style="text-align: center" ><input type = "radio" name = "id" value = "${currentTeam.teamId}"></td>
				<td style="text-align: left">${currentTeam.teamName}</td>
				<td style="text-align: left">${currentTeam.teamType}</td>
				<td style="text-align: left">${currentTeam.preferredNight}</td>
			</tr>
			</c:forEach>
		</table>
		<br />
		<input name="doThisToTeam" value="Edit Team" type="submit" style="margin-right: 2em" /> 
		<input name="doThisToTeam" value="Delete Team" type="submit" style="margin-right: 2em" />
		<input name="doThisToTeam" value="Add New Team" type="submit" />
	</form>
</body>
</html>