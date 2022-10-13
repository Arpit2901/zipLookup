<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>
	<p>all Referrals are printed on the console</p>
	<form>

		<table border="1">
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>AGE</td>
			</tr>
			<c:forEach items="${list}" var="Referral">
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