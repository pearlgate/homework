<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>		
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/css/index.css"/>" rel="stylesheet" />
</head>
<body>
	<%-- <div class="loginStatus">
		<p>${user.nickName}님이 로그인 중!</p>
		<a href="/gallery/logout" id="logoutBtn">로그아웃</a>
	</div> --%>
		<div class="container">
			<!--리뷰 등록하기 -->
			<div>
				<a href="/gallery/getNewPicture" id="getNewPicture">영화등록하기</a>
			</div>
	
			<!--리뷰 가져오기 -->
			<div>
				<a href="/gallery/myReview" id="getMyReview">내가 등록한 리뷰 가져오기</a>
			</div>
		</div>
</body>
</html>