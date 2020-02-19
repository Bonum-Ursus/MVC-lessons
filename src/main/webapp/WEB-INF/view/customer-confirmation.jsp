<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.02.2020
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
    <h3>First name: ${customer.firstName}</h3>
    <h3>Last name: ${customer.lastName}</h3>
    <br><br>
    <a href="/"><h3>Back to main menu</h3></a>
</body>
</html>
