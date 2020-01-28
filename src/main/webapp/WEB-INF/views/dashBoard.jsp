<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
	<head>
		<title>GradApplicationDashboard</title>
	</head>
	<body>
		<p>
			USERNAME- <security:authentication property="principal.username" />
		</p>
		<p>
			ROLE- <security:authentication property="principal.authorities" />
		</p>	
		<h3>The User Dashboard</h3>
		<form:form action="${pageContext.request.contextPath}/logout"
			   method="POST">
			
				<input type="submit" value="Logout" />
		</form:form>
	</body>
</html>