<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<c:set var="path" value="${pageContext.request.contextPath}" />
<a href="${path}/board/list.do">게시판</a>
<c:choose>
	<c:when test="${sessionScope.userId == null}">
		<a href="${path}/member/login.do">로그인</a>
	</c:when>
	<c:otherwise>
		${sessionScope.userId}님이 로그인중입니다.
		<a href="${path}/member/logout.do">로그아웃</a>
	</c:otherwise>
</c:choose>
<hr>