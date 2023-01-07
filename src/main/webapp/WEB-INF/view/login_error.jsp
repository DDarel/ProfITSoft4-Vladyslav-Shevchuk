
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>

</head>
<body>

    <div class="form">

        <h1>Enter system</h1><br>
        <form method="post" action="">

            <input type="text" required placeholder="login" name="login"><br>
            <input type="password" required placeholder="password" name="password"><br><br>
            <p><span style="color: red;">Invalid login or password</span></p>
            <input class="button" type="submit" value="Enter">

        </form>
    </div>
</body>
</html>
