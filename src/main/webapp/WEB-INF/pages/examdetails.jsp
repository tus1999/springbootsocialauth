<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<body>
	<c:url value="/resources/text.txt" var="url"/>
	<spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
	Exam Details Page for user<br>
	User FirstName : ${user.firstName}<br> 
	User LastName : ${user.lastName}<br>
	Exam ID : ${examid}<br>
</body>

</html>
