<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"  %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
    
<%--taglib uri="mylib.tld" prefix="t"--%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>
<c:out value="hello"></c:out>
<h1>My Form</h1>
<form action="s1" method="post">
<input type="text" name="user_name" placeholder="Enter name"/>
<br><br>
<input type="text" name="user_email" placeholder="Enter email"/>
<br><br>
<button type="submit">Send</button>
</form>
<%--<t:my></t:my> --%>
</body>
</html>