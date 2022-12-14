<%--
  Created by IntelliJ IDEA.
  User: hongs
  Date: 31/08/2022
  Time: 11:32 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<tiles:insertDefinition name="template">
    <tiles:putAttribute name="body">
        <h1>Trang Đăng Nhập</h1>
        <c:if test="${not empty error}">
            <p>Sai tên đăng nhập hoặc mật khẩu</p>
        </c:if>
        <form method="post" action="/j_spring_security_check">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <p>
                <input type="text" name="username" id="username" placeholder="Username">
            </p>
            <p>
                <input type="password" name="password" id="password" placeholder="Password">
            </p>
            <p class="submit">
                <input type="submit" name="commit" value="Login">
            </p>
        </form>
    </tiles:putAttribute>
</tiles:insertDefinition>
