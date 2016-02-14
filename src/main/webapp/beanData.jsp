<%--
  Created by IntelliJ IDEA.
  User: al
  Date: 14.02.2016
  Time: 2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Data from EJB</title>
</head>
<body>

<div align="center">

    <jsp:useBean id="my_bean" class="org.DataBean" scope="session"/>
    <jsp:getProperty name="my_bean" property="commonData"/>

    <ul>
        <c:forEach items="${my_bean.listData}" var="item">
            <li>${item}<br></li>
        </c:forEach>
    </ul>

    <div>
        <table border="1">
            <c:forEach items="${my_bean.mapData}" var="entry">
                <tr>
                    <td>${entry.key}<br></td>
                    <td>${entry.value}<br></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <br/>
    <div style="width: 20%; left: 40%">
        <form method="post" action="index.jsp">
            <input type="submit" value="back to start">
        </form>
    </div>
</div>
</body>
</html>
