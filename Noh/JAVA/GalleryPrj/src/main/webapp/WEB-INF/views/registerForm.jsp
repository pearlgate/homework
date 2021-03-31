<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link href="<c:url value="/css/registerForm.css"/>" rel="stylesheet" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
 <script type="text/javascript">
	$(document).ready(function(){
		$("#submit").on("click", function(){
			if($("#nickName").val()==""){
				alert("이름을 입력해 주세요.");
				$("#nickName").focus();
				return false;
			}
			if($("#email").val()==""){
				alert("이메일을 입력해 주세요.");
				$("#email").focus(); 
				return false;
			}
			if($("#password").val()==""){
				alert("비밀번호를 입력해 주세요.");
				$("#password").focus(); 
				return false;
			}							
			var idChkVal = $("#idChk").val();
			if(idChkVal == "N"){
				alert("중복확인 버튼을 눌러주세요.");
				return false;
			}else if(idChkVal == "Y"){
				$("#regForm").submit();
			}
			
			});		
		});
	
	function fn_idChk(){
		$.ajax({
			url : "/gallery/idChk",
			type : "post",
			dataType : "json",
			data : {"email" : $("#email").val()},
			success : function(data){
				console.log(data);
				if(data == 1){
					alert("중복된 이메일입니다.");
				}else{
					$("#idChk").attr("value", "Y");
					alert("사용가능한 아이디입니다.");
				}
			}
		})
	}
</script>

	<div class="container">
		<div class="row">
			<div class="col-md-20">
				<div class="login-box">
					<form:form action="/gallery/postRegister" modelAttribute="user" id="regForm">
						<legend>회원가입</legend>
						<div class="form-group">
							<label> 이름 : <form:input path="nickName" class="form-control" id="nickName" /></label>
							<form:hidden path="id" />
						</div>
						<div class="form-gorup">
							<label> 이메일 : <form:input path="email" class="form-control" id="email" type="email" /></label>
						</div>
						<div class="form-gorup" id="passwordBox">
							<label> 비밀번호 : <form:input path="password" class="form-control" id="password" type="password" /></label>
						</div>
					</form:form>
					<div id="submitBox">
						<div>
							<button class="idChk" type="button" id="idChk" onclick="fn_idChk();" value="N">중복확인</button>
						</div>
						<div class="form-gorup">
							<button type="button" id="submit" class="btn btn-default btn-login-submit">제출</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>