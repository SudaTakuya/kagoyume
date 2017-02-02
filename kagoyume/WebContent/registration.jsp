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
</head>
<body>
	<h1>新規ユーザー登録</h1>
	<form action="/kagoyume/RegistrationConfirm" method="post">
		ユーザー名:<input type="text" name="name" <%if(check.equals("true")){ %>
			value=<%=ud.getName() %>
		<% } %>><br><br>
		パスワード：<input type="text" name="passward" <%if(check.equals("true")){ %>
			value=<%=ud.getPassward() %>
		<% } %>><br><br>
		メールアドレス：<input type="text" name="mail" <%if(check.equals("true")){ %>
			value=<%=ud.getMail() %>
		<% } %>><br><br>
		住所：<input type="text" name="address" <%if(check.equals("true")){ %>
			value=<%=ud.getAddress() %>
		<% } %>><br><br>

		<input type="hidden" name="acRegistration" value=<%=session.getAttribute("acRegistration") %>>
		<input type="submit" name="submit" value="確認画面へ">
	</form>

	<br><br>
	<%=KagoyumeHelper.getInstanse().home() %>
</body>
</html>