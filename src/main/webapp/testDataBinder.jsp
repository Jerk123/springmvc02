<%--
  Created by IntelliJ IDEA.
  User: Jerk
  Date: 2019/6/3
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <title>Title</title>
</head>
<body>
<form action="/testDate2">
    日期:<input type="date" name="date"><br>
    百分比:<input type="text" name="percent"><br>
    <input type="submit" value="提交">
</form>


<button onclick="su()">提交json</button>
<script>

    function su() {

        var student = {
            "name": "zhangsan"
//            , "percent":"70%"
        };
        var student1 = {
            "name": "lisi"
//            , "percent":"60%"
        };
        var arr=[];
        arr.push(student);
        arr.push(student1);

        $.ajax({
            url: '/getJson',
            type: 'post',
            dataType:'json',
            contentType:'application/json;charset=utf-8',
            data:JSON.stringify(arr),
            async:true,
            success:function (result) {

                console.log(result);
            },erroe:function () {
                alert("请求失败");
            }
        });
    }

</script>
</body>
</html>
