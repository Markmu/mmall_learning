<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>HELLO WORLD</h2>


springmvc upload
<form action="/manage/product/upload.do" name="form1" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="springmvc upload">
</form>

richtext upload
<form action="/manage/product/richtext_img_upload.do" name="form2" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="richtext upload">
</form>
</body>
</html>
