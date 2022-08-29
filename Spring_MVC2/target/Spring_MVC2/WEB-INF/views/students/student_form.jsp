<%--
  Created by IntelliJ IDEA.
  User: hongs
  Date: 29/08/2022
  Time: 9:57 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <form:form method = "POST" action="/hello/save">
        <form:hidden path="id"/>
        <table>
            <tr>
                <td>Name:</td>
                <td>
                    <form:input path="name" type="text" />
                    <form:errors path="name" />
                </td>
            </tr>
            <tr>
                <td>Age: </td>
                <td>
                    <form:input path="age" type="text" />
                    <form:errors path="age"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit" />
                </td>
            </tr>
        </table>
    </form:form>
</head>
<body>

</body>
</html>
