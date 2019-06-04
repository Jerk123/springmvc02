<%--
  Created by IntelliJ IDEA.
  User: Jerk
  Date: 2019/6/3
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
<form id="fxm" action="/upload" method="post" enctype="multipart/form-data">

    file:<input type="file" name="file"><br>
    desc:<input type="text" name="desc"><br>

</form>
<input type="button" value="上传" onclick="up()">
<script>
    function up() {
        var formData = new FormData($("#fxm")[0]);
        $.ajax({
            url:'/upload',
            type:'json',
            data:formData,
            async:false,
            contextType:'application/json;charset=utf-8',
            success:function (result) {
                console.log(result)
            },error:function () {
                alert("请求失败")
            }
        });
    }

</script>
</body>
</html>
