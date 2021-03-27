<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
 	<form:form action="/gallery/processLogin" modelAttribute="user"  method="POST">
		<label> Email : <form:input path="email"/></label>		
		<label> password : <form:input path="password"/></label>
		<input type="submit" id="submit">
	</form:form> 
</body>
</html>