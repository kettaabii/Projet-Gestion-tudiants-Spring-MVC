<!-- Fichier student-form.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Form</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <h2 class="mt-5">Student Form</h2>
    <form action="save-student" method="POST">
        <div class="form-group">
            <label for="studentIDNumber">ID Number:</label>
            <input type="text" class="form-control" id="studentIDNumber" name="studentIDNumber">
        </div>
        <div class="form-group">
            <label for="studentName">Name:</label>
            <input type="text" class="form-control" id="studentName" name="studentName">
        </div>
        <div class="form-group">
            <label for="studentEmail">Email:</label>
            <input type="email" class="form-control" id="studentEmail" name="studentEmail">
        </div>
        <div class="form-group">
            <label for="studentPhoneNumber">Phone Number:</label>
            <input type="text" class="form-control" id="studentPhoneNumber" name="studentPhoneNumber">
        </div>
        <div class="form-group">
            <label for="studentProfilePicture">Profile Picture:</label>
            <input type="text" class="form-control-file" id="studentProfilePicture" name="studentProfilePicture">
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="studentHasPCNumber" name="studentHasPCNumber">
            <label class="form-check-label" for="studentHasPCNumber">Has PC Number</label>
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="studentHasBike" name="studentHasBike">
            <label class="form-check-label" for="studentHasBike">Has Bike</label>
        </div>
        <button type="submit" class="btn btn-primary">Save</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>