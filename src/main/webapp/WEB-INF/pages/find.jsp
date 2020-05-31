<%--
  Created by IntelliJ IDEA.
  User: shicheng
  Date: 2020/5/29/0029
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="utf-8"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/find.js"></script>--%>


<html>
<head>
    <title>查询页面</title>
    <script type="text/javascript">

            function test() {
                 alert("ok");
                 $.ajax({
                     url:"/user/ajax",
                     content:"application/json;charset=UTF-8",
                     data:{"u_name":JSON.stringify($("#u_name").value)} ,
                     dataType:"json",
                     type:"post",
                     success:function(data){
                         alert(data);
                     }
                 });
            }

    </script>
</head>
<body>
    查找姓名:<input type="text" name="u_name" id="u_name">
    <button id="bt" onclick="test()">查找</button>


</body>
</html>
