<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�Խñ� ��</h1>
	<p>���� : ${boards.title} </p>
	<p>�ۼ��� : ${boards.createDate} </p>
	<p>�ۼ��� : ${boards.userName} </p>
	<p>���� : ${boards.content} </p>
	<a href="delete?boardId=${boards.id}">����</a>
</body>
</html>