<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add User</title>
</head>
<body>
    <h1>Add User</h1>

    <form:form action="add" modelAttribute="user" method="post">
        Name: <form:input path="name" />
        <form:errors path="name" cssStyle="color: red" /><br>

        Gender: <form:input path="gender" />
        <form:errors path="gender" cssStyle="color: red" /><br>

        Birthday: <form:input type="date" path="birthday" />
        <form:errors path="birthday" cssStyle="color: red" /><br>

        <button type="submit">Submit</button>
    </form:form>
</body>
</html>
