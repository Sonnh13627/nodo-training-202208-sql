<%--
  Created by IntelliJ IDEA.
  User: hongs
  Date: 31/08/2022
  Time: 10:02 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <tiles:insertDefinition name="template">
        <tiles:putAttribute name="body">
            <h2>${messaghe}</h2>
        </tiles:putAttribute>
    </tiles:insertDefinition>;
</body>
</html>
