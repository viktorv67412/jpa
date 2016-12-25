<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body style="margin:0">
<div style="width: 100%; height: 100%; background: #16DB8B;background-size: cover;text-align: center; padding-top:50px">
    <form method="POST" action="<%=request.getContextPath()%>/users">

        Name<br>
        <input type="text" name="name_ui"/><br>
        Password<br>
        <input type="text" name="password_ui"/><br>
        Age<br>
        <input type="text" name="age_ui"/><br>

        <input type="submit" value="add"/><br>
    </form>
</div>
</body>
</html>
