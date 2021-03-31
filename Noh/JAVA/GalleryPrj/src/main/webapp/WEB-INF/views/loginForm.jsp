<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>		    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/css/loginForm.css"/>" rel="stylesheet" />	
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#submit").on("click", function(){
				if($("#email").val() == ""){
					alert("이메일을 입력해주세요");
					return false;
				}else if($("#password").val() == ""){
					alert("비밀번호를 입력해주세요.");
					return false;
				}else{
					$("#loginForm").submit();
				}		
			});
		});
	</script>
	<div class="container">
		<div class="row">
			<div class="col-md-20">
				<div class="login-box">
					<form:form action="/gallery/processLogin" modelAttribute="user"  method="POST"  id="loginForm">
						<legend>로그인</legend>
						<div class="form-group">
							<label> 이메일 : <form:input path="email" class="form-control" id="email"/></label>		
						</div>
						<div class="form-group">
							<label> 비밀번호 : <form:input path="password" class="form-control"/></label>
						</div>
					</form:form>
					<div class="form-group">
						<button type="button" id="submit" class="btn btn-default btn-login-submit" >제출</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>