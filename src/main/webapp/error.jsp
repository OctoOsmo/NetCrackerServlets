<%--
  Created by IntelliJ IDEA.
  User: al
  Date: 04.02.2016
  Time: 2:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<div align="center">
    <div style="width: 20%; left: 40%">
        <p>Неверный логин или пароль</p>
        <form method="post" action="index.jsp">
            <input type="submit" value="back to start">
        </form>
    </div>
</div>
<div>
    <div style="font-weight: bold">
        <jsp:text>login: </jsp:text><%=request.getParameter("login")%>
    </div>
    <div>
        <jsp:text>password: </jsp:text><%=request.getParameter("password")%>
    </div>
</div>
</body>
</html>
