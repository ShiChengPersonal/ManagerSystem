<%--
  Created by IntelliJ IDEA.
  User: shicheng
  Date: 2020/5/27/0027
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加用户页面</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓名：<input type="text" name="u_name"><br>
        性别：<input type="text" name="u_gender"><br>
        地址：<input type="text" name="u_address"><br>
        联系电话：<input type="text" name="u_phone"><br>
        余额：<input type="text" name="u_money"><br>
        说明：<input type="text" name="u_caption"><br>
        备注：<input type="text" name="u_remarks"><br>
        <input type="submit" value="提交" >
    </form>

</body>
</html>
