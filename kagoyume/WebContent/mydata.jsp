<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper,
				kagoyume.UserData,
				java.text.SimpleDateFormat" %>
<%
	UserData loginUser = (UserData)session.getAttribute("loginUser");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
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
	<%if(loginUser != null){ %>
		<ul class="list-inline">
      		<li><h3><%=KagoyumeHelper.getInstanse().logout("/index.jsp") %></h3></li>
      		<li><h3><%=KagoyumeHelper.getInstanse().cart() %></h3></li>
      		<li><h3>ようこそ<a href="/kagoyume/MyData"><%=loginUser.getName() %>さん</a></h3></li>
   	 	</ul>
	<% }else{ %>
		<ul class="list-inline">
      		<li><h3><%=KagoyumeHelper.getInstanse().login("/index.jsp") %></h3></li>
   	 	</ul>
	<% } %>

	<h1><%=loginUser.getName() %>さんのマイページ</h1>

	<h2>ユーザー登録情報</h2>
	<table class="table table-bordered">
		<tr>
			<th bgcolor="silver">ユーザー名</th>
			<td><%=loginUser.getName() %></td>
		</tr>
		<tr>
			<th bgcolor="silver">パスワード</th>
			<td><%=loginUser.getPassward() %></td>
		</tr>
		<tr>
			<th bgcolor="silver">メールアドレス</th>
			<td><%=loginUser.getMail() %></td>
		</tr>
		<tr>
			<th bgcolor="silver">住所</th>
			<td><%=loginUser.getAddress() %></td>
		</tr>
		<tr>
			<th bgcolor="silver">合計購入金額</th>
			<td>￥<%=loginUser.getTotal() %></td>
		</tr>
		<tr>
			<th bgcolor="silver">最終更新日</th>
			<td><%=sdf.format(loginUser.getNewDate()) %></td>
		</tr>

	</table>
	<a href="/kagoyume/MyUpdate" class="btn btn-primary btn-default">登録情報を更新する</a>
	<a href="/kagoyume/MyDelete" class="btn btn-primary btn-default">ユーザーを削除する</a>
	<a href="/kagoyume/MyHistory?userID=<%=loginUser.getUserID()%>" class="btn btn-primary btn-default">購入履歴</a>

	<br><br>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>