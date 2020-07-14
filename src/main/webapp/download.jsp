<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>


<h1>用来下载文件</h1>
<a href="${pageContext.request.contextPath}/file/download?fileName=tmp.txt">tmp.txt</a><br>
<a href="${pageContext.request.contextPath}/file/download?fileName=time.jpg">time.jpg</a><br>
<a href="${pageContext.request.contextPath}/file/download?fileName=tmp.txt">tmp.txt</a><br>




</body>
</html>