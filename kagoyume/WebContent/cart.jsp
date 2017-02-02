<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.ItemData,
                 java.util.ArrayList,
                 java.util.List,
                 kagoyume.KagoyumeHelper,
                 kagoyume.UserData" %>
<%
	UserData loginUser = (UserData)session.getAttribute("loginUser");
	List<ItemData> cart = (ArrayList<ItemData>) session.getAttribute("cart");
	if(cart == null){
		cart = new ArrayList<ItemData>();
	}
	int total = 0;
	int deleteNum = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
      		<li><h3><%=KagoyumeHelper.getInstanse().login("/cart.jsp") %></h3></li>
   	 	</ul>
	<% } %>


	<h1>お買い物カート</h1>
	<%if(cart.isEmpty()){%>
		<p class="lead">カートに商品はありません</p>
	<% }else{ %>
		<div class="panel panel-default">
			<table class="table">
				<tr bgcolor="silver">
					<th>商品画像</th>
					<th>商品名</th>
					<th>価格</th>
					<th>削除</th>
				</tr>
				<% for(ItemData id : cart){ %>
					<tr>
						<td><img src="<%=id.getImg_small() %>" alt="商品画像"></td>
						<td><a href="/kagoyume/Item?detailCode=<%=id.getCode() %>"><%=id.getName() %></a></td>
						<td>￥<%=id.getPrice() %></td>
						<td><a href="/kagoyume/CartDelete?deleteNum=<%= deleteNum %>" class="btn btn-primary btn-sm">削除</a>
						<% total += id.getPrice(); deleteNum++;%>
				<% } %>
			</table>
			<div class="panel-heading"><p class="lead">合計金額 : ￥<%=total %></div>
		</div>
		<br>

		<form action="/kagoyume/BuyConfirm" method="Post">
			<input type="hidden" name="acBuy" value=<%=session.getAttribute("acBuy") %>>
			<input class="btn btn-primary btn-lg" type="submit" name="submit" value="購入する">
		</form>
	<% } %>

	<br><br>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>