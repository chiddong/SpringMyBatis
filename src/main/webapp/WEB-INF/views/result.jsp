<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://me2.do/5BvBFJ57">
<style>

</style>
</head>
<body>
	
	<!-- result.jsp -->	
	<h1>결과</h1>
	
	<div class="panel">
		${result}
	</div>
	
	<div class="panel" title="상품명">
		${item}
	</div>
	
	<div class="panel" title="상품">
		<div>${dto.item}</div>
		<div>${dto.price}</div>
		<%-- <div>${dto.regdate}</div> --%>
	</div>
	
	<table>
		<tr>
			<th>이름</th>
			<th>가격</th>
			<th>날짜</th>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.item}</td>
			<td>${dto.price}</td>
			<%-- <td>${dto.regdate}</td> --%>
		</tr>
		</c:forEach>
	</table>
	
	<div class="panel" title="레코드 개수">
		${count}
	</div>
	
	
	<script>
		
		
	
	</script>	

</body>
</html>