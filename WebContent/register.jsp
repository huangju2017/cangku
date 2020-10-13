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
		<h1>--注册页面--</h1>
	</div>

	<div>
		<form action="${pageContext.request.contextPath}/StudentServlet?cmd=register" method="post">
			<p>
				账号：<input type="text" name="sname" id="sname">
			</p>
			<p>
				密码：<input type="password" name="spassword" id="spassword">
			</p>
			<p>
				确认：<input type="password" id="spassword2">
			</p>
			<p>
				年龄：<input type="text" name="age" id="age">
			</p>
			<p>
				验证：<input type="text" name="validateCode">
			</p>

			<p>
				<input type="submit" value="立即注册">
			</p>
		</form>
	</div>

</body>
</html>