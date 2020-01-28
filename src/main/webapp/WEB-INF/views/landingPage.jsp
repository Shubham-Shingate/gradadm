<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
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












