<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>auth jsp</title>
</head>
<body>
<div style="width: 20%; margin-left: 40%" >
    <div align="center">
        <h1>Authentication page</h1>
    </div>
    <%--<p>To invoke the java servlet click <a href="admin">here</a></p>--%>
    <form method="post" action="auth">
        <div><label for="login">login</label></div>
        <input type="text" name="login" id="login">
        <div><label for="password">password</label></div>
        <input type="password" name="password" id="password">
        <div>
            <input type="submit" name="submit" value="submit">
        </div>
    </form>
</div>

</body>
</html>