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
      		<li><h3><%=KagoyumeHelper.getInstanse().login("/add.jsp") %></h3></li>
   	 	</ul>
	<% } %>

	<h1>追加完了</h1>
	<h3>カートに商品を追加しました</h3>


	<br>
	<%=KagoyumeHelper.getInstanse().cart() %>
	<p class="lead"><a href="/kagoyume/search.jsp">検索結果に戻る</a></p>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>