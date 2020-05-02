<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- <form>
		<input type="text" name="dir"/>
		<input type="submit" value="Enter"/>
	</form> -->
	<%-- <!-- 
	EL->Expression Language
	it will start with $ followed by{}
	  -->
	<c:set var="userAge" value="${param.age}"></c:set>
	<c:if test="${userAge>18 }">
		<c:out value="You can vote"></c:out>
	</c:if> --%>

	<%-- <c:forEach var="num" begin="1" end="10" step="1">
		<c:out value="${num }"/><br/>
	</c:forEach>  --%>

	<%-- <%
		int []val=new int[]{5,6,54,2,4,2,8};
		for(int n:val)
		{
			sout(n);
		}
	%> --%>

	<%-- <c:forEach var="num" items="{5,6,54,2,4,2,8 }" >
		<c:out value="${num }"></c:out>
	</c:forEach>  --%>

	<%-- 	<c:set var="dirVal" value="${param.dir}"></c:set>
	<c:choose>
		<c:when test="${dirVal==1 }">
			<c:out value="East"></c:out>
		</c:when>
		<c:when test="${dirVal==2 }">
			<c:out value="West"></c:out>
		</c:when>
		<c:when test="${dirVal==3 }">
			<c:out value="North"></c:out>
		</c:when>
		<c:when test="${dirVal==4 }">
			<c:out value="South"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="Invalid"></c:out>
		</c:otherwise>
	</c:choose> --%>

	<%-- <c:redirect url="https://www.youtube.com/"/> --%>


	<c:catch var="errMsg">
		<%
			int num=5/0;
		%>
	</c:catch>
	<c:if test="${errMsg!=null }">
		<c:out value="${errMsg}"></c:out>
	</c:if>
</body>
</html>