<%--
  Created by IntelliJ IDEA.
  User: hongs
  Date: 31/08/2022
  Time: 10:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Welcome to Spring jazz</h1>
    <p><a href="/">Trang Chu</a> </p>
    <tiles:insertAttribute name ="body"/>
</body>
</html>
