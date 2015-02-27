<%--
  Created by IntelliJ IDEA.
  User: SCJP
  Date: 26.02.2015
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title></title>
</head>
<body>
<div class="col-sm-offset-1 col-sm-10">

    <div>
        <table id="dataTable" class="table table-striped table-bordered">
            <thead>
            <tr>
                <th>id</th>
                <th>firstName</th>
                <th>falilyName</th>
                <th>email</th>
            </tr>
            <thead>
            <tbody>
            <c:forEach var="u" items="${usersModel}">
            <tr>
                <td>${u.id}</td>
                <td>${u.firstName}</td>
                <td>${u.familyName}</td>
                <td>${u.email}</td>
            <tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <img src="/resources/pic.jpg" />
</div>
</body>
</html>
