<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>was test</title>
</head>
<body>
<h1><%= "tomcat test" %>
</h1>
<br/>
<a href="<%= request.getContextPath() %>/hello">hello</a>
</body>
</html>