<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>		
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/css/beforeLogin.css"/>" rel="stylesheet" />	
</head>
<body>
	<div class="container">
		<div id="linkContainer">
			<a id="goLoginForm" class="formLink" href="/gallery/getLogin">로그인</a>
			<a class="formLink" href="/gallery/getRegister">회원가입</a>
		</div>
	</div>
</body>
</html>