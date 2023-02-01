<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="/resources/css/home.css">
<title>Insert title here</title>
</head>
<body>
	<a href="create">�Խñ� ����</a>
	<table>
		<thead>
			<th>����</th>
			<th>�ۼ���</th>
			<th>�ۼ���</th>
		</thead>
		<tbody>
<%-- 			<%
				List<BoardDTO> boards = (List) request.getAttribute("boards");
				for(BoardDTO board : boards){%>
					<tr>
						<td><%=board.getTitle()%></td>
						<td><%=board.getUserName()%></td>
						<td><%=board.getCreateDate()%></td>
					</tr>
				<%}%> --%>
			<c:forEach items="${boards}" var="board">
				<tr>
					<td>${board.title}</td>
					<td>${board.userName}</td>
					<td>${board.createDate}</td>
					<td><a href="detail?boardId=${board.id}">�ڼ��� ����</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>