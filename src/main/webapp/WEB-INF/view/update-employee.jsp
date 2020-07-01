<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<form:form action="updateEmployee" modelAttribute="employee">
		<br><br>
		ID:<form:input readonly="true" path="id" />
		<br><br>
		First name:<form:input path="firstName" />
		<br><br>
		Last name:<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		Address: <form:input path="address"/>
		<form:errors path="address" cssClass="error"/>
		<br><br>
		Phone Number: <form:input path="phoneNumber"/>
		<form:errors path="phoneNumber" cssClass="error"/>
		<br><br>
		Email Address: <form:input path="emailAddress"/>
		<form:errors path="emailAddress" cssClass="error"/>
		<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>