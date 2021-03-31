<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/css/welcome.css"/>" rel="stylesheet" />	
</head>
<body>
	 <div class="container">
        <div id="welcome">
            <h1 id="welcomeMsg"><a href="/gallery/beforeLogin">DIARY</a>에 오신것을 환영합니다.</h1>
            <a id="goBefore" id="start" href="/gallery/beforeLogin">시작하기</a>
        </div>
    </div>
</body>
</html>