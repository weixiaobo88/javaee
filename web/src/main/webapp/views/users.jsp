<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title>User List</title>
    <style>
        th {
            width: 20%;
        }
        td {
            text-align: center;
        }
        table, tr, th, td {
            border: 1px solid #ccc;
        }
    </style>
</head>
<body>
    <h2> Hello World! </h2>

    <table>
        <thead>User List</thead>
        <tbody>
            <tr>
                <th>姓名</th>
                <th>性别</th>
                <th>邮箱</th>
                <th>年龄</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.gender}</td>
                    <td>${user.email}</td>
                    <td>${user.age}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
