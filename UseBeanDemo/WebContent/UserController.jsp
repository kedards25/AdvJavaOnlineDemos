<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- UserModel model=new UserModel() -->
	<jsp:useBean id="model" class="com.learning.mvc_demo.models.UserModel">
		<!-- model.setUserName(request.getParameter("userNm")) -->
		<jsp:setProperty name="model" property="userName" value="${param.userNm }"/>
		<!-- model.setUserName(request.getParameter("userPwd")) -->
		<jsp:setProperty name="model" property="userPwd" value="${param.userPwd}"/>
		
		<!-- model.getUserName() -->
		<jsp:getProperty name="model" property="userName"/>
	</jsp:useBean>
</body>
</html>