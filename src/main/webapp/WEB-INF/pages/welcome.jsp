<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<body>
	Welcome ${username} !<br> 
	You are logged in with role : ${role}<br>
	<a href="/logout">Logout</a>
</body>

</html>
