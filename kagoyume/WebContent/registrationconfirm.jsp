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
</head>
<body>
	<%if(check.equals("")){ %>
		<h1>以下の内容で登録します</h1>
		ユーザー名：<%=ud.getName() %><br>
		パスワード:<%=ud.getPassward() %><br>
		メールアドレス:<%=ud.getMail() %><br>
		住所:<%=ud.getAddress() %><br><br>

		よろしければ登録するを選択してください<br>
		<form action="/kagoyume/RegistrationComplete" method="Post">
			<input type="hidden" name="acRegistration" value=<%=session.getAttribute("acRegistration") %>>
			<input type="submit" name="submit" value="登録する">
		</form>
	<% }else{ %>
		<h1>入力項目が不足しています</h1>
		<%=check %>が不足しています
	<% } %>
	<br><br>
	<a href="/kagoyume/registration.jsp">入力画面に戻る</a>
</body>
</html>