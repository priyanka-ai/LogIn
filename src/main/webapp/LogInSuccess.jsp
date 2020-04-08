<%--
  Created by IntelliJ IDEA.
  User: Priya
  Date: 08-04-2020
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type"content="text/html; charset=US-ASCII">
    <title>Log in success page</title>
</head>
<body>
<h1><%= request.getAttribute("user")%>  ,login succesful.</h1>
<a href="LogIn.html">Login page</a>
</body>
</html>
