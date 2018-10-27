<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
	<%@ include file="../include/menu.jsp" %>
    <form name="updateForm" method="POST" action="${path}/board/update.do">
    
    <table border="1" align="center" >
    	<tr>
    		<td>글번호</td>
    		<td><input name="boardId" value="${dto.boardId}" type="text" readonly="disabled"/></td>
    	</tr>
		<tr >
			<td>제목 </td>
			<td width="300" height="100"><input name="title" value="${dto.title}" type="text"/></td>
		</tr>
		<tr>
			<td>내용 </td>
			<td width="300" height="100"><textarea name="content" rows="5" cols="50">${dto.content}</textarea></td>
		</tr>
		<tr>
			<td>작성일</td>
			<td><fmt:formatDate value="${dto.regDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>		
		</tr>
		<tr>
			<td>수정일</td>
			<td><fmt:formatDate value="${dto.modDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>		
		</tr>
		<tr>	
			<td colspan="2" align="right">
				<input type="submit" value="저장"/>
			</td>
		</tr>
	</table>
    </form>
</body>
</html>