<%--
  Created by IntelliJ IDEA.
  User: Injae
  Date: 2021-03-08
  Time: 오후 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Employees</h1>
<button onclick="window.location.href='showFormForAddEmployee'">Add Employee</button>

<div>
    <table border="1px">
        <tr>
            <th>Full Name</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Hobbies</th>
            <th>Country</th>
            <th>Address</th>
            <th>Actions</th>
        </tr>

        <c:forEach items="${listemployees }" var="e">

            <c:url var="deleteLink" value="/deleteemployee">
                <c:param name="employeeId" value="${e.id}" />
            </c:url>

            <c:url var="updateLink" value="/editemployee">
                <c:param name="employeeId" value="${e.id}" />
            </c:url>

            <tr>
                <td>${e.fullname }</td>
                <td>${e.email }</td>
                <td>${e.gender }</td>
                <td>${e.hobbies }</td>
                <td>${e.country }</td>
                <td>${e.address }</td>

                <td>
                    <a href="${updateLink}">Update</a>
                    <a href="${deleteLink}" onclick="if(!(confirm('Are you sure want to delete the record?'))) return false;">Delete</a></td>
            </tr>
        </c:forEach>
    </table>


</div>
</body>
</html>
