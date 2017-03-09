<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

	<body>
        <form action="/loginpage" method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <div><input type="submit" value="Sign In"/></div>
            <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
        </form>
        <br><br>
        <h3>Connect to Facebook</h3>
		<div>
			With Facebook: <a href="/login/facebook">click here</a>
		</div>
		
		<form action="/login/facebook" method="POST">
			<input type="hidden" name="scope" value="user_posts" />
			<div class="formInfo">
				<p>You aren't connected to Facebook yet. Click the button to connect this application with your Facebook account.</p>
			</div>
			<p><button type="submit">Connect to Facebook</button></p>
		</form>
    </body>
</html>