<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.g.entity.GameValue"%>
<%!
	GameValue min = new GameValue(0);
	int minNum = min.getValue();
	GameValue max = new GameValue(1000);
	int maxNum = max.getValue();
	
	GameValue hit = new GameValue(1);
	
	GameValue ran = new GameValue();	
	int random = ran.setRandom(max.getValue());
	
%>
<% System.out.println(maxNum); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>

 
	  <h2>새로 만든 페이지입니다. <%=minNum %> ~ <%=maxNum %>사이의 숫자를 넣어주세요.</h2>
		<form action="getJspRandom.jsp">
			<label>당신의 숫자는??</label><input type="text" name="guessNum"><br>
			<input type="hidden" name="max" value=<%=maxNum %>>
			<input type="hidden" name="min" value=<%=minNum %>>
			<input type="hidden" name="hit" value=<%=hit.getValue() %>>
			<input type="hidden" name="random" value=<%=random %>>
			
			<input type="submit" value="제출">
		</form>
	</div>
</body>
</html>