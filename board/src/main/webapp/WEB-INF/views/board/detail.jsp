<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 상세</h1>
	<p>제목 : ${boards.title} </p>
	<p>작성일 : ${boards.createDate} </p>
	<p>작성자 : ${boards.userName} </p>
	<p>내용 : ${boards.content} </p>
	<a href="delete?boardId=${boards.id}">삭제</a>
</body>
</html>