<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form method="post" action="/display-discount ">
    <label for="des">Product Description</label><br/>
    <input type="text" id="des" name="des" placeholder="mô tả"><br/>
    <label for="price">List Price</label><br/>
    <input type="text" id="price" name="price" placeholder="giá niêm yết"><br/>
    <label for="per">Discount Percent</label><br/>
    <input type="text" id="per" name="per" placeholder="tỷ lệ chiết khấu (%)"><br/>
    <button type="submit">Calculate Discount</button>
</form>
</body>
</html>