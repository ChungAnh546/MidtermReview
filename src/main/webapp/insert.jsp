<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 27/10/2023
  Time: 2:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>insert</title>
</head>
<body>
    <form action="controls?action=insert_lophoc" method="post">
     <label>ma lop</label>   <input name="mslop"/><br>
        <label>ten lop</label>   <input name="tenlop"/><br>
        <label>giao vien chu nhiem</label>   <input name="giaoviencn"/><br>
        <input type="submit" value="insert"/>
        <input type="reset" value="clear"/>

    </form>
</body>
</html>
