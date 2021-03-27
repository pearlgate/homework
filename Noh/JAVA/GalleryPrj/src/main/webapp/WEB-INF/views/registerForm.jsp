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
	<h1>회원가입</h1>
	
	<form:form action="/gallery/postRegister" modelAttribute="user">
		<form:hidden path="id"/>
		<label> Nick Name : <form:input path="nickName"/></label>
		<label> Email : <form:input path="email"/></label>
		<label> Password : <form:input path="password"/></label>		
		<input type="submit" id="submit">
	</form:form> 
	
</body>
</html>