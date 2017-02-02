<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>かごいっぱいのゆめ</title>
<%--Bootstrap CDN css読み込み --%>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
</head>
<body>
	<h1>ユーザーログイン</h1>
	<form action="/kagoyume/LoginCheck" method="Post">
		<div class="form-group">
			<label>ユーザー名</label>
			<input class="form-control" type="text" name="name" >
		</div>
		<div class="form-group">
			<label>パスワード</label>
			<input class="form-control" type="text" name="passward">
		</div>
		<input type="hidden" name="returnURL" value=<%=(String)request.getAttribute("returnURL") %>>
		<input type="hidden" name="acLogin" value=<%=session.getAttribute("acLogin") %>>
		<input type="submit" name="submit" value="ログイン" class="btn btn-primary btn-lg">
	</form>

	<br>
	<p>アカウントをお持ちでない場合は<a href="/kagoyume/Registration">新規登録</a></p>

	<br><br>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>