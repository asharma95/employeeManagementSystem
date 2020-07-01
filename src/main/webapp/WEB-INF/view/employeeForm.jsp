<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
	<head>
		<title>Employee Registration</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="employee">
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