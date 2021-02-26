<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.g.entity.GameValue"%>


<%
	int guessNum_ =Integer.parseInt(request.getParameter("guessNum"));
	int max =Integer.parseInt(request.getParameter("max"));
	int min =Integer.parseInt(request.getParameter("min"));
	int hit =Integer.parseInt(request.getParameter("hit"));
	int random =Integer.parseInt(request.getParameter("random"));
	
	hit = hit+1;
	System.out.println(guessNum_);
	System.out.println("r:"+random);
	String text = "";
	if(guessNum_ == random){
		text="맞추셨습니다.";
	}else if(guessNum_ > random && guessNum_ < max){
		text="숫자를 낮추세요.";
	}else if(guessNum_ < random && guessNum_ > min){
		text="숫자를 높이세요.";
	}else {
		text= min +"와"+max+"사이의 값을 넣어주세요";
	}
	
	
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	  <h2><%= text %></h2>
	  <% if(guessNum_ != random){ %>
		<form action="getJspRandom.jsp" method="POST">
			<label><%=hit %>번째 입니다. 당신의 숫자는??</label><input type="text" name="guessNum"><br>
			<input type="hidden" name="max" value=<%=max %>>
			<input type="hidden" name="min" value=<%=min %>>
			<input type="hidden" name="hit" value=<%=hit %>>
			<input type="hidden" name="random" value=<%=random %>>
			<input type="submit" value="제출">
		</form>
		<%} %>
	</div>
</body>
</html>