<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper,
				 kagoyume.UserData,
				 kagoyume.ItemData,
				 java.util.ArrayList"%>
<%
	UserData ud = (UserData)session.getAttribute("loginUser");
	ArrayList<ItemData> historyItem = (ArrayList<ItemData>)request.getAttribute("historyItem");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>かごいっぱいのゆめ</title>
<%--Bootstrap CDN css読み込み --%>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
</head>
<body>
	<h1><%=ud.getName() %>さんの購入履歴</h1>
	<table class="table table-bordered">
		<tr bgcolor="silver">
			<th>商品名</th>
			<th>価格</tr>
		<tr>
		<% for(ItemData id : historyItem){ %>
			<tr>
				<td><%=id.getName() %></td>
				<td>￥<%=id.getPrice() %></td>
			</tr>
		<% } %>

	</table>

	<br><br>
	<%=KagoyumeHelper.getInstanse().mydata() %>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>