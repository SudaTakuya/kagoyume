<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kagoyume.KagoyumeHelper" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>かごいっぱいのゆめ</title>
</head>
<body>
	エラーが発生しました。以下の項目を確認してください。<br>
        <%=request.getAttribute("error")%><br><br>
       	<%=KagoyumeHelper.getInstanse().home() %>
</body>
</html>
