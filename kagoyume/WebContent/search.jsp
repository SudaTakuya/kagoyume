<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.ItemData,
				java.util.ArrayList,
				java.util.List,
				kagoyume.KagoyumeHelper,
				kagoyume.UserData" %>
<%
	UserData loginUser = (UserData)session.getAttribute("loginUser");
	String searchWard = (String) session.getAttribute("searchWard");
	String hitCount = (String) session.getAttribute("hitCount");
	List<ItemData> resultData = (ArrayList<ItemData>) session.getAttribute("resultData");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>かごいっぱいのゆめ</title><%--Bootstrap CDN css読み込み --%>
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
      		<li><h3><%=KagoyumeHelper.getInstanse().login("/search.jsp") %></h3></li>
   	 	</ul>
	<% } %>

	<h1>検索結果</h1>
	<p class="lead">検索ワード：<%=searchWard%></p>
	<p class="lead">検索ヒット数：<%=Integer.parseInt(hitCount) %>件</p>
	<%if(resultData.isEmpty()){ %>
		<p class="lead">検索ワードに一致する商品はありませんでした</p>
	<% }else{ %>
		<div class="panel panel-default">
			<div class="panel-heading"><p class="lead">検索結果の上位２０件を表示します</p></div>
			<table class="table" >
				<%for(ItemData id : resultData){ %>
				<tr>
					<td><img src="<%=id.getImg_small()%>" alt="画像"></td>
					<td><p class="lead"><a href="/kagoyume/Item?detailCode=<%=id.getCode() %>"><%=id.getName() %></a></p></td>
					<td><p class="lead">￥<%=id.getPrice() %></p></td>
				</tr>
				<% } %>
			</table>
		</div>
	<% } %>

	<br>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>