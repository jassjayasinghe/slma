<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>${message}</p>
	<form action="/SMSystem/login/loginValidation" method="post">
		<p>
			User name <input type="text" id="un">
		</p>
		<p>
			Password <input type="password" id="pw">
		</p>
		<p>
			<button type="submit">Log in</button>
		</p>
	</form>

</body>
</html>