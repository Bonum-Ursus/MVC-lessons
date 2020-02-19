<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 18.02.2020
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input form</title>
</head>
<body>
    <form action="/form/upperCase" method="POST">
        <div>
            <input type="text" name="name" placeholder="Type your name" />
        </div>
        <br>
        <div>
            <input type="text" name="lastName" placeholder="Type your last name" />
        </div>
        <br>
        <input type="submit">
    </form>
</body>
</html>
