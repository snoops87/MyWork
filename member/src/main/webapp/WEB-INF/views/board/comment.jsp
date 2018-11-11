<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<script>
// 댓글 등록하기(Ajax)
	function fn_comment(code){
		$.ajax({
			type:'POST',
			url:"<c:url value='/board/addComment.do'/>",
			data:$("#commentForm").serialize(),
			success:function(data){
				if(data=="success"){
					getCommentList();
					$("#comment").val("");
				}
			},
			error:function(request, status, error){
				
			}
		});
	}
// 초기 페이지 로딩시 댓글 불러오기
$(function(){
	getCommentList();
});

// 댓글 불러오기 
function getCommentList(){
	$.ajax({
		type:'GET',
		url:"<c:url value='/board/commentList.do'/>",
		dataType:"json",
		data:$("#commentForm").serialize(),
		contentType:"application/x-www-form-urlencoded; charset=UTF-8",
		success:function(data){
			var html = "";
			var cCnt = data.length;
			if(data.length > 0){
				for(i = 0; i < data.length; i++){
					html += "<div>";
					html += "<div><table class='table'><h6><strong>"+data[i].writer+"</strong></h6>";
				}
			}
		}
	});
}
</script>
</head>
<body>
<div class="container">
	<form id="form" name="form" method="post">
	<br><br>
	<div>
		<div>
			<span><strong>Comments</strong></span>
		</div>
		<div>
			<table class="table">
				<tr>
					<td>
						<textarea style="width: 1100px" row="3" cols="30" id="comment" name="comment"><</textarea>
						<br>
						<div>
							<a href="#" onClick="fn_comment('${result.code}')" class="btn pull-right btn-success">등록</a>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<input type="hidden" id="boardId" name="boardId" value="${result.code }"/>
	</form>
</div>
<div class="container">
	<form id="commentListForm" name="commentListForm" method="post">
		<div id="commentList">
		</div>
	</form>
</div>
</body>
</html>




























