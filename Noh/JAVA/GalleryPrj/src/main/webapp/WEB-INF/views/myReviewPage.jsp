<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/css/myReviewPage.css"/>" rel="stylesheet" />
</head>
<body>
	<div class="loginBox">
		<p>${user.nickName}님 환영합니다!</p>
		<a href="/gallery/logout" id="logoutBtn">로그아웃</a>
	</div>
	
	<!--리뷰 등록하기 -->
	<div>
		<a href="/gallery/getNewPicture" id="getNewPicture">영화등록하기</a>
	</div>
	
	<!--전체리뷰 보기 -->
	<div class="wrapper">
		<h1>요즘 즐겨본 영화</h1>
		<div class="img-area">
			<c:forEach items="${pictureList.picture}" var="p">
			<div class="single-img">
				<a href="/gallery/detailReview?id=${p.id}">
				<img id="single-img" src="${pageContext.request.contextPath}/${p.thumbImg}">
				</a>
				<p>제목 : ${p.title}<p>
				<p>등록일 : <fmt:formatDate value="${p.regDate}" pattern="yyyy-MM-dd"/></p>
			</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>