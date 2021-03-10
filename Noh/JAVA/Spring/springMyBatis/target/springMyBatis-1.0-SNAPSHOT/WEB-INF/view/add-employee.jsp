<%--
  Created by IntelliJ IDEA.
  User: Injae
  Date: 2021-03-09
  Time: 오전 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Add Employee</h1>
    <s:form modelAttribute="employee" action="saveProcess">

        Employee Name : <s:input path="fullname" /><br>

        Employee Email : <s:input path="email" /><br>

        Gender: <s:radiobutton path="gender" value="Male" />Male<br>
        <s:radiobutton path="gender" value="Female" />Female<br>

        Interests : <s:checkbox path="hobbies" value="Sports" />Sports<br>
        <s:checkbox path="hobbies" value="Books" />Books<br>
        <s:checkbox path="hobbies" value="Swimming" />Swimming<br>
        <s:checkbox path="hobbies" value="Cycling" />Cycling<br>

        Country : <s:select path="country">
            <s:option value="India">India</s:option>
            <s:option value="Australia">Australia</s:option>
            <s:option value="South Africa">South Africa</s:option>
            <s:option value="America">America</s:option>
            <s:option value="Korea">Korea</s:option>
        </s:select><br>

        Address : <s:textarea path="address" />

        <input type="submit" value="Save Employee">

    </s:form>
</body>
</html>
