<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>${user.nickName}님이로그인중.</p>
	<p>${user.id}님이로그인중.</p>
	
	<img id="image" src="${pageContext.request.contextPath}/${detail.thumbImg}">
	<p>title : ${detail.title}</p>
	<p>comment : ${detail.coment}</p>
	<label for="regdate">작성날짜 : </label>
	<fmt:formatDate value="${detail.regDate}" pattern="yyyy-MM-dd"/>
	
	<button type="button" id="modify_btn">수정</button>
	<button type="button" id="delete_btn">삭제</button>

	<script type="text/javascript">
		window.onload = function(){
			document.getElementById('delete_btn').onclick = function(){
				alert("게시물이 삭제 되었습니다.");
				var form = document.createElement("form");
				form.setAttribute("method", "POST");
				form.setAttribute("action", "/gallery/deleteReview");
				document.body.appendChild(form);
				
				var input_id = document.createElement("input");
				input_id.setAttribute("type", "hidden");
				input_id.setAttribute("name", "id");
				input_id.setAttribute("value", ${detail.id});
				form.appendChild(input_id);
				
				form.submit();
			};
			
			document.getElementById('modify_btn').onclick = function(){
				var form = document.createElement("form");
				form.setAttribute("method", "POST");
				form.setAttribute("action", "/gallery/getUpdate");
				document.body.appendChild(form);
				
				var input_id = document.createElement("input");
				input_id.setAttribute("type", "hidden");
				input_id.setAttribute("name", "id");
				input_id.setAttribute("value", ${detail.id});
				form.appendChild(input_id);
				
				form.submit();
			};
		};
		
	</script>	
</body>
</html>








