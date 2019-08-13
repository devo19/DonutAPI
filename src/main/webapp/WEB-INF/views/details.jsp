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
    <h1>Donut</h1>
    <p>Name: ${donut.name}</p>
    <p>Calories: ${donut.calories}</p>
    <p>Extras:</p>
    <ul>
        <c:forEach items="${donut.extras}" var="i">
            <li>${i}</li>
        </c:forEach>
    </ul>
    <a href="/">Home</a>     
</body>
</html>