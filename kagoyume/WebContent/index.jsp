<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper,
                 kagoyume.UserData" %>
<%
	UserData loginUser = (UserData)session.getAttribute("loginUser");
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

	<h1>かごいっぱいのゆめ</h1>
	<h2><mark>かごいっぱいのゆめとは・・・</mark></h2>
	<p class="lead">
		かごいっぱいのゆめは<u><strong>好きなだけ買い物ができる気分が味わえるECサイト</strong></u>です<br>
		注意：<u><strong>実際に購入はできません</strong></u><br><br>
		下の検索フォームから検索して、思う存分に購入する気分を味わいましょう！
	</p>
	<form action="/kagoyume/Search" method="get">
		<input class="input-lg"type="text" name="searchWard">
		<input class="btn btn-primary btn-lg" type="submit" name="submit" value="検索">
	</form>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>