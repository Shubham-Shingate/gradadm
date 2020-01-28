<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>GradAdmLandingPage</title>
		
	</head>
	<body>
		
		<p>
         Welcome to the landing page! This page is open to the public ... no login required :-)
      </p>
      <hr>
      <p>
         <a href="${pageContext.request.contextPath}/students">Student Login (requires login)</a> 
      </p>
      <p>
      	<a href="${pageContext.request.contextPath}/admins">Admin Login (requires login)</a>
      </p>
	</body>
</html>












