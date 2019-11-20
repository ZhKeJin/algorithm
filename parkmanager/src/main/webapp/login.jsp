<%--
  Created by IntelliJ IDEA.
  User: 26948
  Date: 2019/4/18
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
  <head>
    <title>111</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath }/user/userLogin.do" method="post">

      姓名：<input type="text" name="phonenumber"/></br>
      年龄：<input type="text" name="password"/><br>
      <input type="submit" value="注册"/>
    </form>
  </body>
</html>
