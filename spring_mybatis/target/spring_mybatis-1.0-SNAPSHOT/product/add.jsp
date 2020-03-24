<%--
  Created by IntelliJ IDEA.
  User: qianghj
  Date: 2020/2/18
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>添加商品</title>
    </head>
    <body>
        <h2>添加商品</h2>
        <form action="${pageContext.request.contextPath}/product/add" method="post">
            商品名称：<input type="text" name="proName"/><br/>
            商品编号：<input type="text" name="proNum"/><br/>
            商品价格：<input type="text" name="proPrice"/><br/>
            商品产地：<input type="text" name="proAddress"/><br/>
            商品颜色：<input type="text" name="proColor"/><br/>
            商品尺寸：<input type="text" name="proSize"/><br/>

            <input type="submit" name="添加"/><br/>
        </form>
    </body>
</html>
