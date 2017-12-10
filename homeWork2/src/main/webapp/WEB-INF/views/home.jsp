<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<p> <a href="${pageContext.request.contextPath }/lecture"> 수강한 과목 조회하기 </a> </p>
	<p> <a href="${pageContext.request.contextPath }/complete_grade"> 학기별 이수학점 조회 </a> </p>
	<p> <a href="${pageContext.request.contextPath }/classification_grade"> 이수 구분별 학점 조회 </a> </p>
	<p> <a href="${pageContext.request.contextPath }/course_registration"> 수강신청 </a> </p>
	<p> <a href="${pageContext.request.contextPath }/check_registration"> 수강신청 조회하기 </a> </p>
</body>
</html>
