<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper,
				 kagoyume.UserData" %>
<%
UserData ud = (UserData)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<%--Bootstrap CDN css読み込み --%>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<head>
<meta charset="UTF-8">
<title>かごいっぱいのゆめ</title>
</head>
<body>
	<h1>ユーザー登録データ更新</h1>
	<form action="/kagoyume/MyUpdateResult" method="post">
		<div class="form-group">
			<label>ユーザー名</label>
			<input class="form-control" type="text" name="name" value=<%=ud.getName() %>>
		</div>
		<div class="form-group">
			<label>パスワード</label>
			<input class="form-control" type="text" name="passward" value=<%=ud.getPassward() %>>
		</div>
		<div class="form-group">
			<label>メールアドレス</label>
			<input class="form-control" type="text" name="mail" value=<%=ud.getMail() %>>
		</div>
		<div class="form-group">
			<label>住所</label>
			<input class="form-control" type="text" name="address" value=<%=ud.getAddress() %>>
		</div>

		<input type="hidden" name="userID" value=<%=ud.getUserID() %>>
		<%--不正アクセス防止コードを送信 --%>
		<input type="hidden" name="acUpdate" value=<%=session.getAttribute("acUpdate") %>>
		<input type="submit" name="submit" value="確認画面へ" class="btn btn-primary btn-lg">
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