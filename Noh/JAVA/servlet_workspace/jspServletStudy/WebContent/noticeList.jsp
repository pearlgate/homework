<%@page import="java.util.List"%>
<%@page import="jspServletStudyEntity.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<div class="notice margin-top">
				<h3 class="hidden">공지사항 목록</h3>
				<table class="table">
					<thead>
						<tr>
							<th class="w60">번호</th>
							<th class="expand">제목</th>
							<th class="w100">작성자</th>
							<th class="w100">작성일</th>
							<th class="w60">조회수</th>
						</tr>
					</thead>
					<tbody>
				
					
					<c:forEach var="n" items="${list }">
					<tr>
						<td>${n.id }</td>
						<td class="title indent text-align-left"><a href="detail.html">${n.title }</a></td>
						<td>${n.writerId }</td>
						<td>
							${n.regDate }		
						</td>
						<td>${n.hit }</td>
					</tr>			
					</c:forEach>		
					
					</tbody>
				</table>
			</div>
</body>
</html>