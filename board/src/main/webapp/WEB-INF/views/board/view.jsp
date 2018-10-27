<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VIEW</title>
<script type="text/javascript">
	function btn_event(){
		if(confirm("삭제하시겠습니까?") == true){
			location.href ="${path}/board/delete.do?boardId=${dto.boardId}";
		}else{
			return;
		}
	}
</script>
</head>
<body>
<form name="form" method="get">
<div align="center">
	<%@ include file="../include/menu.jsp" %>	
	<table border="1" align="center" >
			<tr >
				<td>제목 </td><td width="300" height="100">${dto.title}</td>
			</tr>
			<tr>
				<td>내용 </td><td width="300" height="100">${dto.content}</td>
			</tr>
			<tr>	
				<td colspan="2" align="right">
					<input type="hidden" name="boardId" value="${dto.boardId}">
					<a href="${path}/board/update?boardId=${dto.boardId}">수정</a>
					<a href="${path}/board/delete.do?boardId=${dto.boardId}">삭제</a>
				</td>
			</tr>
		</table>
</div>
</form>
</body>
</html>