<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${userObj}
		<form action="updateUser">
		
			<input type="text" name="userNm" value="${UserModel.userName }"/><br/>
			<input type="password" name="userPwd" value="${userObj.getUserPwd() }"/></br/>
			<input type="submit" value="Update">
		</form>
</body>
</html>