<%--
  Created by IntelliJ IDEA.
  User: hongs
  Date: 29/08/2022
  Time: 11:27 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <script>
        function view(id) {
            var xmlHttp = new XMLHttpRequest();
            xmlHttp.open("GET","json/"+id,true);
            xmlHttp.onload = function () {
                if (this.status != 200) return;
                var student = JSON.parse(this.responseText);
                document.getElementById('content').innerHTML = 'Name: '+student.name;
                var dialog = document.getElementById('viewStudent');
                dialog.show();
            };
            xmlHttp.send();
        };


    </script>
</head>
<body>

<form action="/hello/list" method="get">
    <table border="1">
        <tr>
            <td colspan="4"><input type="text" name="q" size = "30" /></td>
            <td><input type="submit" value = "Submit"/></td>
        </tr>
        <tr>

            <td>Id</td>
            <td>Name</td>
            <td>Age</td>
            <td></td>
            <td></td>
        </tr>
        <c:forEach items="${students}" var = "student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>
                    <a href="delete/${student.id}">Delete</a>
                </td>
                <td>
                    <a href="edit/${student.id}">Edit</a>
                </td>
                <td>
                    <a href="javascript:view(${student.id})">Log Json</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
<dialog id="viewStudent" style="width: 50%; border: 1px dotted black">
    <div id="content"></div>
    <button id="hide">Close</button>
</dialog>
<script>
    (function () {
        var dialog = document.getElementById("viewStudent");
        document.getElementById('hide').onclick = function (){
            dialog.close();
        };
    })();
</script>
</body>
</html>
