<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8"  %>
<html>
<body>
<h2>Hello World! this is showAll 444444444 aaaa </h2>
<c:forEach items="${requestScope.users}" var="user">
    ${user.id} ----${user.name}-----${user.age}----${user.bir}----<fmt:formatDate value="${user.bir}"/> <br>
</c:forEach>
</body>
</html>
