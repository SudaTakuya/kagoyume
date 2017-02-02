<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.UserData" %>
<%
	String check = (String)request.getAttribute("checkStr");
	UserData ud = (UserData)session.getAttribute("formData");
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
	<%if(check.equals("")){ %>
		<h1>以下の内容で登録します</h1>
		<ul class="list-unstyled">
			<li>ユーザー名：<%=ud.getName() %></li>
			<li>パスワード:<%=ud.getPassward() %></li>
			<li>メールアドレス：<%=ud.getMail() %></li>
			<li>住所:<%=ud.getAddress() %></li>
		</ul>
		<br>
		<p class="lead">よろしければ登録するを選択してください</p>
		<form action="/kagoyume/RegistrationComplete" method="Post">
			<input type="hidden" name="acRegistration" value=<%=session.getAttribute("acRegistration") %>>
			<input type="submit" name="submit" value="登録する" class="btn btn-primary btn-lg">
		</form>
	<% }else{ %>
		<h1>入力項目が不足しています</h1>
		<p class="lead"><%=check %>が不足しています</p>
	<% } %>
	<br><br>
	<p class="lead"><a href="/kagoyume/registration.jsp">入力画面に戻る</a></p>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>