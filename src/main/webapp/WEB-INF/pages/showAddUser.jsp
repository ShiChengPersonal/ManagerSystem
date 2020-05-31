<%--
  Created by IntelliJ IDEA.
  User: shicheng
  Date: 2020/5/27/0027
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加结果显示</title>
</head>
<body>
    ${msg}
    姓名：${user.u_name}<br>
    性别：${user.u_gender}<br>
    地址：${user.u_address}<br>
    联系电话：${user.u_phone}<br>
    余额：${user.u_money}<br>
    说明：${user.u_caption}<br>
    备注：${user.u_remarks}<br>
    创建时间：${user.u_createTime}<br>
</body>
</html>
