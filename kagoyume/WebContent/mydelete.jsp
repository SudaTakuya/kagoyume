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
</head>
<body>
	<h1>以下のユーザーを本当に削除しますか</h1>
	<h3>削除したユーザーは元に戻せません</h3>
	ユーザー名：<%=ud.getName() %><br>
	パスワード:<%=ud.getPassward() %><br>
	メールアドレス：<%=ud.getMail() %><br>
	住所:<%=ud.getAddress() %><br>
	合計購入金額:<%=ud.getTotal() %><br>
	最終更新日:<%=sdf.format(ud.getNewDate()) %>

	<br><br>
	削除してよろしいですか？<br>
	<form action="/kagoyume/MyDeleteResult" method="Post">
		<input type="hidden" name="acDelete" value=<%= session.getAttribute("acDelete") %>>
		<input type="submit" name="submit" value="削除する">
	</form>

	<br><br>
	<%=KagoyumeHelper.getInstanse().mydata() %>
	<br><br>
	<%=KagoyumeHelper.getInstanse().home() %>

</body>
</html>