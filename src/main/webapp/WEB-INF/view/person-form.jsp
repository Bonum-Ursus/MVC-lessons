<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.02.2020
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Person Form</title>
    </head>
    <body>
        <form:form action="register" modelAttribute="person">
            First name: <form:input path="firstName" />
            <br><br>
            Last name: <form:input path="lastName" />
            <br><br>
            Country:
            <form:select path="country">
                <form:options items="${person.countryMap}" />
            </form:select>
            <br><br>
            Favorite Language:
            <br>
            <form:radiobuttons path="favoriteLanguage" items="${person.favoriteLanguages}" />
            <br><br>
            Operating Systems:
            <br>
            <form:checkboxes path="OS" items="${person.OSmap}" />
            <br><br>

            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
