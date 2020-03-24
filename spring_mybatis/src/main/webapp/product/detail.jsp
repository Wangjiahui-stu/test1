<%--
  Created by IntelliJ IDEA.
  User: qianghj
  Date: 2020/2/18
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>商品详情页</title>
</head>
<body>
    <h2>商品详情</h2>

        商品id： ${product.proId}<br/>
        商品名称：${product.proName}<br/>
        商品编号：${product.proNum}<br/>
        商品价格：${product.proPrice}<br/>
        商品尺寸：${product.proSize}<br/>
        商品颜色：${product.proColor}<br/>
        商品产地：${product.proAddress}<br/>
        生产日期：
       <br/>

</body>
</html>
