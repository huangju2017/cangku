<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>

	<div>
		<h1>--- 登录 ---</h1>
	</div>
	
	<div>
		<form method="post" action="${pageContext.request.contextPath }/StudentServlet?cmd=login">
			<p>
			账号:<input type="text" name="sname" id="sname"/>
		</p>
		<p>
			密码:<input type="password" name="spassword" id="spassword"/>
		</p>
		<p>
			<input type="submit" value="立即登录">
		</p>
		</form>
		
		<div style="color:red">${login_error_msg}</div>
	</div>


</body>
</html>