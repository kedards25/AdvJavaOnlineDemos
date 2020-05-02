<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="dataConfig" driver="org.h2.Driver"
	url="jdbc:h2:tcp://localhost/~/test" user="sa" password="" />
	
	<sql:query dataSource="${dataConfig }" var="dataSet">
		select * from usermodel
	</sql:query>
	
	<c:forEach var="row" items="${dataSet.rows }" >
		<c:out value="${row.name }"></c:out>
		<c:out value="${row.pwd }"></c:out><br/>
	</c:forEach>
	
</body>
</html>