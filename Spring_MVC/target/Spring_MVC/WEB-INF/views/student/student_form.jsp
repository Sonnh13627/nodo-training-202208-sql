<%--
  Created by IntelliJ IDEA.
  User: hongs
  Date: 26/08/2022
  Time: 1:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h2>Please Input Student Information</h2>
<form:form method="POST" action="save">
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
</body>
</html>

