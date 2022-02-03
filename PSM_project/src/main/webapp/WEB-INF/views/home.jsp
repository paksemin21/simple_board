<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	어서오세요! 
</h1>

<P>  현재 서버 시간은 ${serverTime}. </P>

<br>
<a href="/board/list">게시판으로 이동</a>
</body>
</html>
