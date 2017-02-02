<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper,
				kagoyume.UserData,
				java.text.SimpleDateFormat" %>
<%
	UserData ud = (UserData)session.getAttribute("loginUser");
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
	<h1>以下のユーザーを本当に削除しますか</h1>
	<p class="lead">削除したユーザーは元に戻せません</p>
	<ul class="list-unstyled">
		<li>ユーザー名：<%=ud.getName() %></li>
		<li>パスワード:<%=ud.getPassward() %></li>
		<li>メールアドレス：<%=ud.getMail() %></li>
		<li>住所:<%=ud.getAddress() %></li>
		<li>合計購入金額:<%=ud.getTotal() %></li>
		<li>最終更新日:<%=sdf.format(ud.getNewDate()) %></li>
	</ul>

	<br>
	<p class="lead">削除してよろしいですか？</p>
	<form action="/kagoyume/MyDeleteResult" method="Post">
		<input type="hidden" name="acDelete" value=<%= session.getAttribute("acDelete") %>>
		<input type="submit" name="submit" value="削除する" class="btn btn-primary btn-lg">
	</form>

	<br><br>
	<%=KagoyumeHelper.getInstanse().mydata() %>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</body>
</html>