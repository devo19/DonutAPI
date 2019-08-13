<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1 align = "center">Donuts</h1>
	<ul>
		<c:forEach items="${donuts}" var="i">					
		<p>
		<li>
		<a href = "details?id=${i.id}">${i.name}</a>
		</li>
		</p>
		</c:forEach>
				
	</ul>
</body>
</html>