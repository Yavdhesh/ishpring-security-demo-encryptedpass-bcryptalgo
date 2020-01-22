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
<title>Gruh</title>
</head>
<body>

Naccho naacho re

<hr>
UserId : <security:authentication property="principal.username"/>
Role/s : <security:authentication property="principal.authorities"/>
<security:authorize access="hasRole('MANAGER')">

<hr>
<p>
<a href="${pageContext.request.contextPath}/leaders">Netaao/prabandhako ke liye</a>
</p>
<hr>
</security:authorize>

<security:authorize access="hasRole('ADMIN')">
<p>
<a href="${pageContext.request.contextPath}/admins">prashaasnic logo ke liye</a>
</p>
<hr>
</security:authorize>
<form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="logout"/>
</form:form>

</body>
</html>