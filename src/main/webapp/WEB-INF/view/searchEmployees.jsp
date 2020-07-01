<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<body>
		<h2>Search Employee System </h2>
		<<c:if test="${!empty employees}">  
			 <table>
			   <tr>  
			     <td>ID</td>  
			     <td>First Name</td>  
			     <td>Last Name</td>
			     <td>Address</td>  
			     <td>Phone Number</td>
			     <td>Email Address</td>
			     <td>Delete/Update</td>    
			  </tr>  
			  <c:forEach items="${employees}" var="employee">
			  <tr>  
			    <td><c:out value="${employee.id}"/></td>  
			    <td><c:out value="${employee.firstName}"/></td>  
			    <td><c:out value="${employee.lastName}"/></td>
			    <td><c:out value="${employee.address}"/></td> 
			    <td><c:out value="${employee.phoneNumber}"/></td>
			    <td><c:out value="${employee.emailAddress}"/></td> 
			    <td><a href="delete/${employee.id}">Delete</a><a href="update/${employee.id}">/Update</a></td>     
			   </tr>
			   </c:forEach>  
		  </table>  
		</c:if>
	</body>
</html>
