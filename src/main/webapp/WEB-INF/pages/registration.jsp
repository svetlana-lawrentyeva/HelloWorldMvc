<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration</title>
    <%@ page isELIgnored="false" %>
</head>
<body>
<div align="center">
    <form:form action="add" method="post" commandName="userForm">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Spring MVC Form Demo - Registration</h2></td>
            </tr>
            <tr>
                <td>User id:</td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td>firstName:</td>
                <td><form:password path="firstName" /></td>
            </tr>
            <tr>
                <td>familyName:</td>
                <td><form:input path="familyName" /></td>
            </tr>
            <tr>
                <td>email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>teacher:</td>

                <td><form:select path="teacher">
                    <form:options items="${teachers}" />
                </form:select>
                </td>
                <%--<td>--%>
                    <%--<form:select path="teacher">--%>
                        <%--<c:forEach items="${teachers}" var="t">--%>
                            <%--<option value="${t}">${t.firstName} ${t.familyName}</option>--%>
                        <%--</c:forEach>--%>
                    <%--</form:select>--%>
                <%--</td>--%>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="send" /></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>