<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String returnURL = (String)request.getParameter("returnURL");
%>
<html>
<head>
<meta charset="UTF-8">
<title>かごいっぱいのゆめ</title>
<%--Bootstrap CDN css読み込み --%>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
</head>
<body>
	<h1>ログインできませんでした</h1>
	<p>該当するユーザーが見つかりませんでした。<br>ユーザー名、パスワードに間違いがないか
	ご確認ください</p>

	<br><br>
	<p class="lead"><a href="/kagoyume/Login?isLogin=false&returnURL=<%=returnURL %>">ログイン画面に戻る</a></p>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>