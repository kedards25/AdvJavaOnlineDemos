
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%-- this is comment --%>
	<%! int a=5; %>
	<h1>
	<!-- this is called as scriptlet tag -->
		<%--out is an implicit object of jspwriter --%>
	<%
		String val=request.getParameter("username");
		
		out.println("Hello World"+a);
	%></h1>
	<input type="text" value="<%=a %>"/>
	<%@ include file="samplefile.jsp" %>
</body>
</html>