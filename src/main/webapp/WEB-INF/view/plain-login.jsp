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
<title>Loggin Kar naako</title>


</head>
<body>
<c:set var="myContext" value="${param.error}"/>
<form:form action="authenticateTheUser" method="POST">
<c:if test="${myContext ne null}">
<i>Mitraa aapne trutipoorna us ps naakaa hai</i>
</c:if>
<p>
UserName <input name="username" type="text" />
</p>

<p>
Guptshabda <input name="password" type="password" />
</p>

<input type="submit" value="Login"/>

</form:form>

</body>
</html>