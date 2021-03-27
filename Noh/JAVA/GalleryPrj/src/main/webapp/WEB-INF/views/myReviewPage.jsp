<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
		<p>${user.nickName}님이로그인 중.</p>
		<p>${user.id}님이로그인 중.</p>
		<a href="/gallery/logout" id="logoutBtn">로그아웃</a>
	</div>
<!--리뷰 등록하기 -->
	<div>
		<a href="/gallery/getNewPicture" id="getNewPicture">영화등록하기</a>
	</div>
	
<!--전체리뷰 보기 -->
	<h2>요즘 즐겨본 영화</h2>
	<table>
		<tr>
			<th>Image</th>
			<th>Title</th>
		</tr>
		<c:forEach items="${pictureList.picture}" var="p">
			<tr>
				<td><img id="image" src="${pageContext.request.contextPath}/${p.thumbImg}"></td>
				<td><p>${p.title}</p></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>