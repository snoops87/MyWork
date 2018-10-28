<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<script type="text/javascript">
function sendIt(){

	if(form.title.value==""){
		alert("제목 필수");
		form.title.focus();
		return false;
	}
	
	if(form.content.value==""){
		alert("내용 필수");
		form.content.focus();
		return false;
	}
}
</script>
</head>
<body>
<%
	
%>
	<%@ include file="../include/menu.jsp" %>
	<form name="form" method="post" action="${path}/board/insert.do" onsubmit="return sendIt();">
		<table border="1" align="center">
			<tr >
				<td>제목  </td><td><input name="title" id="title" size="30"></td>
			</tr>
			<tr align="center">
				<td>내용  </td><td><textarea name="content" id="content" rows="8" cols="60"></textarea></td>
			</tr>
			<tr>	
				<td></td>
				<td>
					<input type="submit" id="btnSend" value="저장">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>