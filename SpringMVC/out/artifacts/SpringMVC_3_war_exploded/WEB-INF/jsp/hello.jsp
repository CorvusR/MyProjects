<%--
  Created by IntelliJ IDEA.
  User: XIEHE-IT03
  Date: 2021/5/6
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    /*let user = JSON.parse('{"user"：{"name":"张三","age":"88"}}')
    let user1 = JSON.stringify(user)*/
    let users = [{name: "张三", age: "88"}
                  ,{name: "李四", age: "99"}]
    let string = JSON.stringify(users)
    let user2 = JSON.parse(string)
    console.log(string)
    console.log(user2.name)
</script>
<body>
${msg}
</body>
</html>
