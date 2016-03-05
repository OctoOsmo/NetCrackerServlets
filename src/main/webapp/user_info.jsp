<%--
  Created by IntelliJ IDEA.
  User: al
  Date: 04.03.2016
  Time: 5:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="white">
<div style="margin-left: 40%">
    <jsp:useBean
            id="userInfo"
            class="org.UserInfo">
        <jsp:setProperty name="userInfo" property="*" />
    </jsp:useBean>

    The following information was saved:
    <ul>
        <li>User Name: <jsp:getProperty
                name="userInfo" property="userName" />
        <li>Age: <jsp:getProperty
                name="userInfo" property="age" />
        <li>Email Address: <jsp:getProperty
                name="userInfo" property="emailAddr" />
        <li>hair color: <jsp:getProperty
                name="userInfo" property="hairColor" />
        <li>Lucky number: <jsp:getProperty
                name="userInfo" property="luckyNumber" />
    </ul>
    Bean mood: <jsp:getProperty
        name="userInfo" property="beanMood" />
    <form action="user_info.html">
        <input type="submit" value="back">
    </form>
    <form action="index.jsp">
        <input type="submit" value="back to login page">
    </form>
</div>
</body>
</html>
