<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.ItemData,
                kagoyume.KagoyumeHelper,
                kagoyume.UserData" %>
<%
	UserData loginUser = (UserData)session.getAttribute("loginUser");
	ItemData id = (ItemData)session.getAttribute("detailData");
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
      		<li><h3><%=KagoyumeHelper.getInstanse().login("/item.jsp") %></h3></li>
   	 	</ul>
	<% } %>


	<h1>商品詳細</h1>
	<h3><%=id.getName() %></h3>
	<img src="<%=id.getImg_large()%>" alt="商品画像">

	<div class="panel panel-default">
		<div class="panel-heading"><p class="lead">商品概要</p></div>
		<table class="table">
		<tr>
			<th>商品名</th>
			<td><%=id.getName() %></td>
		</tr>
		<tr>
			<th>価格</th>
			<td>￥<%=id.getPrice() %></td>
		<tr>
		<tr>
			<th>説明</th>
			<td>￥<%=id.getDescription() %></td>
		<tr>
		<tr>
			<th>評価</th>
			<td>レビュー平均：<%=id.getReviewRate() %>点(５点満点)<br>
				<%=id.getReviewCount() %>人の評価<br>
				<a href=<%=id.getReviewUrl() %>>レビューを見る</a></td>
		<tr>
		</table>
	</div>

	<a href="/kagoyume/Add" class="btn btn-primary btn-lg" role="button">この商品をカートに追加する</a>

	<br><br>
	<p class="lead"><a href="/kagoyume/search.jsp">検索結果に戻る</a></p>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>