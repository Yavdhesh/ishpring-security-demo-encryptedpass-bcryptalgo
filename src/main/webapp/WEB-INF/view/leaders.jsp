<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    <%@ page isELIgnored="false"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Netaao re vaatte</title>
</head>
<body>

<h2>Swaagatam Netaa ji yo</h2>
<hr>
UserId : <security:authentication property="principal.username"/>
Role/s : <security:authentication property="principal.authorities"/>
<hr>
<a href="${pageContext.request.contextPath}/">Gruh prustha</a>
<hr>
</body>
</html>