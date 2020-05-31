$(function (){
    $("#bt1").onclick(function () {

        $.ajax({
            url:"/user/ajax",
            content:"application/json;charset=UTF-8",
            data:{"u_name":$("#u_name").valueOf()} ,
            dataType:"json",
            type:"post",
            success:function(data){
                alert(data);
            }
        });
    });

});