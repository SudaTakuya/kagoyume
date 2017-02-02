<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.ItemData,
				 kagoyume.KagoyumeHelper,
                 java.util.ArrayList" %>
<%
	ArrayList<ItemData> cart = (ArrayList<ItemData>) session.getAttribute("cart");
	int total = 0;
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
	<h1>購入確認</h1>
	<div class="panel panel-default">
		<table class="table table-bordered">
		<% for(ItemData id : cart) { %>
			<tr>
				<td><%=id.getName() %></td>
				<td>￥<%=id.getPrice() %></td>
			</tr>
			<% total += id.getPrice(); %>
		<% } %>
		</table>
	<div class="panel-heading"><p class="lead">合計金額 : ￥<%=total %></p></div>
	</div>

	<p class="lead">発送方法を選択してください</p>
	<form action="/kagoyume/BuyComplete" method="POST">
		<div class="radio">
		<% for(int i = 0;i < 3;i++) { %>
		<label>
			<input type="radio" name="type" value=<%=i%>
			<% if(i == 0){ %>
				checked
			<% } %>><%=KagoyumeHelper.getInstanse().intToType(i)%>
		</label>
		<% } %>
		</div>
		<br>
		<input type="hidden" name="total" value="<%=total %>">
		<input type="hidden" name="acBuy" value=<%=session.getAttribute("acBuy") %>>
		<h3>上記の内容でよろしければ、「購入する」ボタンを押してください</h3>
		<input class="btn btn-primary btn-lg" type="submit" name="submit" value="購入する">
	</form>

	<br>
	<%=KagoyumeHelper.getInstanse().cart() %>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>