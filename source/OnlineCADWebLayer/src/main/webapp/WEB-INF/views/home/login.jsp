<%@page import="org.springframework.security.web.WebAttributes"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<div id="main-container" class = "content">
	<div id="login">
		<form id="loginForm" name="loginForm" action="j_spring_security_check"	method="post">
			<div>
				<h2>Login</h2>
				<br />
				<div>
					<label for="userName">Username:</label> 
					<input id="userName" type="text" name="j_username" size="18" />
				</div>
				<div>
					<label for="userPassword">Password:</label> 
					<input id="userPassword" type="password" name="j_password" size="18" />
				</div>
				<c:if test="${not empty param.err}">
					<div>
						<span id="infomessage" class="err"> 
							Login failed due to: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />. 
						</span>
					</div>
				</c:if>
				<div>
					<div>
						<label for="remember_me">Remember Me:</label>
					</div>
					<div>
						<input type="checkbox" name="_spring_security_remember_me" id="remember_me" />
					</div>
				</div>
				<div>
					<input type="submit" value="Login" size="18" id="Login" />
				</div>
			</div>
		</form>
	</div>
</div>