<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper,
				 kagoyume.UserData" %>
<%
	UserData ud = (UserData)request.getAttribute("formData");
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
	<h1>ユーザー登録情報の更新が完了しました</h1>
	<h3>以下の内容で更新しました</h3>
	ユーザー名：<%=ud.getName() %><br>
	パスワード:<%=ud.getPassward() %><br>
	メールアドレス：<%=ud.getMail() %><br>
	住所:<%=ud.getAddress() %>

	<br><br>
	<%=KagoyumeHelper.getInstanse().mydata() %>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>