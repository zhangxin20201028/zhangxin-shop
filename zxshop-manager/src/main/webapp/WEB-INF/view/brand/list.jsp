<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<link href="/resource/css/jquery/screen.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resource/js/jquery.validate.js"></script>
<title>Insert title here</title>
</head>
<body>
	<table class="table table-hover">
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach items="${list}" var="brand">
		<tr>
			<td>${brand.id}</td>
			<td>${brand.name}</td>
			<td></td>
			<td></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>