<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Referral Successful</title>
</head>
<body>
<h1>${message}</h1>
	<form action="viewReferral.html">
		<br> <input type="submit" name="viewList">
	</form>
	<form>

		<table border="1">
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>AGE</td>
			</tr>
			<c:forEach var="Referral" items="${list}" >
				<tr>
					<td>${Referral.id}</td>
					<td>${Referral.name}</td>
					<td>${Referral.age}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>