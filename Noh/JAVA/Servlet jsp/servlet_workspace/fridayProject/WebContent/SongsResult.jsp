<%@page import="fridayProject.songs.entity.Album"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>          
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#submit{
		margin-top : 10px;
		width : 150px;
		height : 30px;
	}
</style>
</head>
<body>
	<h1>Choose your favorite singer</h1>
	<% Album album = new Album(); 
	
	
	List<Album> result =(List<Album>)request.getAttribute("results");
		for(int i =0; i<result.size(); i++){
			album = result.get(i);	
			out.println(album.getArtistName()+album.getAlbumName()+album.getTrack()+album.getTitle())
		;}
	 %>
		
</body>
</html>