<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Form Page</title>
    </head>
    <body>
        <h1>Create User</h1>
        <form:form action="${pageContext.request.contextPath}/admin/create" method="post" modelAttribute="user">
            <form:input path="fname" placeholder="First Name"/>
            <br/>
            <form:input path="lname" placeholder="Last Name"/>
            <br/>
            <form:input path="username" placeholder="Username"/>
            <br/>
            <form:password path="passwd" placeholder="Password"/>
            <br/>
            <form:select path="roleSet" items="${roloi}" itemValue="rid" itemLabel="rname" multiple="true"/>
            <br/>
            <input type="submit" value="Save"/>
        </form:form>
    </body>
</html>
