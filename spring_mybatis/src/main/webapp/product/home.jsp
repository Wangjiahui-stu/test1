<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020/3/7
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
        <body>
            <h2>根据主键查询</h2>
        <form action="/product/getById">
            <input type="text" name="proId">
            <input type="submit" value="提交">
        </form>
        </body>
</html>
