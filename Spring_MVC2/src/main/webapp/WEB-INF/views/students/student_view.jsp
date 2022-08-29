<%--
  Created by IntelliJ IDEA.
  User: DO TAT HOA
  Date: 25-Aug-22
  Time: 04:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add New Student</title>
</head>
<body>
    <c:forEach items="${student}" var="student">
    Name: ${student.name}
    <br>
    Age: ${student.age}
    </c:forEach>
</body>
</html>
