<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body onload='document.f.username.focus();'>
	<h3>로그인</h3>
	<form name='f' action="<c:url value="/login" />" method='POST'>
		<table>
			<tr>
				<td>Username:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='text' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name='submit' type='submit' value='로그인' /></td>
			</tr>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</table>
	</form>
</body>
</html>