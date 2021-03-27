<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<p>${user.nickName}님이 로그인 중.</p>
	<p>${user.id}님이 로그인 중.</p>
	<h1>영화 등록</h1>
	<form:form action="/gallery/createNewPicture" modelAttribute="picture" method="POST" enctype="multipart/form-data">
		<form:hidden path="user_id" value="${user.id}" />
		<label> 제목 : <form:input path="title" /></label>
		<label> 감상 : <form:input type="textarea" path="coment" /></label>
		<div class="inputArea">
			<label for="movieImg">이미지</label> <input type="file" id="movieImg" name="file" />
			<div class="select_img">
				<img src="" />
			</div>

			<script>
				$("#movieImg").change(
						function() {
							if (this.files && this.files[0]) {
								var reader = new FileReader;
								reader.onload = function(data) {
									$(".select_img img").attr("src", data.target.result).width(500);
								}
								reader.readAsDataURL(this.files[0]);
							}
						});
			</script>
			<!--파일이 저장되는 실제 경로  -->
			<%=request.getRealPath("/") %>
		</div>
		<input type="submit" id="submit">
	</form:form>

</body>
</html>