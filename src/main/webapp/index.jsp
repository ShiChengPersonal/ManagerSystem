<%--
  Created by IntelliJ IDEA.
  User: shicheng
  Date: 2020/5/26/0026
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
    <form action="/user/findOne" method="post">
        姓名：<input type="text" name="u_name"><br>
            <input type="submit" value="提交">
    </form>
    <a href="/page/toAdd">跳转到添加页面</a>
    <a href="/page/toFind">跳转到查询页面</a>
</body>
</html>
