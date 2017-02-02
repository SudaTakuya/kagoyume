<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper,
				 kagoyume.UserData" %>
<%
	String check = (String)session.getAttribute("submited");
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
	<h1>新規ユーザー登録</h1>
	<form action="/kagoyume/RegistrationConfirm" method="Post">
		<div class="form-group">
			<label>ユーザー名</label>
			<input type="text" name="name" class="form-control" <%if(check.equals("true")){ %>
			value=<%=ud.getName() %>
			<% } %>>
		</div>
		<div class="form-group">
			<label>パスワード</label>
			<input type="text" name="passward" class="form-control" <%if(check.equals("true")){ %>
			value=<%=ud.getPassward() %>
			<% } %>>
		</div>
		<div class="form-group">
			<label>メールアドレス</label>
			<input type="text" name="mail" class="form-control" <%if(check.equals("true")){ %>
			value=<%=ud.getMail() %>
			<% } %>>
		</div>
		<div class="form-group">
			<label>住所</label>
			<input type="text" name="address" class="form-control" <%if(check.equals("true")){ %>
			value=<%=ud.getAddress() %>
			<% } %>>
		</div>

		<input type="hidden" name="acRegistration" value=<%=session.getAttribute("acRegistration") %>>
		<input type="submit" name="submit" value="確認画面へ" class="btn btn-primary btn-lg">
	</form>

	<br><br>
	<%=KagoyumeHelper.getInstanse().home() %>

	<%--JQuery読み込み --%>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<%--Bootstrap CDN javascript読み込み --%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>