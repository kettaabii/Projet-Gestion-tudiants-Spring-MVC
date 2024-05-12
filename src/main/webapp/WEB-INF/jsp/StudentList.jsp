<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des étudiants</title>
</head>
<body>
<h2>Liste des étudiants</h2>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">ID Number</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Phone Number</th>
        <th scope="col">Has PC</th>
        <th scope="col">Has Bike</th>
        <th scope="col">Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
        <!-- construct an "update" link with customer id -->
        <c:url var="updateLink" value="/update-student">
            <c:param name="studentId" value="${student.getStudentIDNumber()}" />
        </c:url>

        <!-- construct an "delete" link with customer id -->
        <c:url var="deleteLink" value="/remove-student">
            <c:param name="studentId" value="${student.getStudentIDNumber()}" />
        </c:url>
        <tr>
            <td>${student.getStudentIDNumber()}</td>
            <td>${student.getStudentName()}</td>
            <td>${student.getStudentEmail()}</td>
            <td>${student.getStudentPhoneNumber()}</td>
            <td>${student.getStudentHasPCNumber()}</td>
            <td>${student.getStudentHasBike()}</td>
            <td>
                <!-- display the update link -->
                <a href="${updateLink}">Update</a>
                <a href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>