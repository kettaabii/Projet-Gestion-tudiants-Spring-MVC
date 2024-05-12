<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Dashboard</title>
    <link rel="shortcut icon" href="./images/logo.png">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Sharp" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<header>
    <div class="logo" title="University Management System">
        <img src="./images/logo.png" alt="">
        <h2>U<span class="danger">M</span>S</h2>
    </div>
    <div class="navbar">
        <a href="index.jsp" class="active">
            <span class="material-icons-sharp">home</span>
            <h3>Home</h3>
        </a>
        <a href="timetable.jsp" onclick="timeTableAll()">
            <span class="material-icons-sharp">today</span>
            <h3>Time Table</h3>
        </a>
        <a href="exam.jsp">
            <span class="material-icons-sharp">grid_view</span>
            <h3>Examination</h3>
        </a>
        <a href="password.jsp">
            <span class="material-icons-sharp">password</span>
            <h3>Change Password</h3>
        </a>
        <a href="#">
            <span class="material-icons-sharp" onclick="">logout</span>
            <h3>Logout</h3>
        </a>
    </div>
    <div id="profile-btn">
        <span class="material-icons-sharp">person</span>
    </div>
    <div class="theme-toggler">
        <span class="material-icons-sharp active">light_mode</span>
        <span class="material-icons-sharp">dark_mode</span>
    </div>

</header>
<div class="container">
    <aside>
        <div class="profile">
            <div class="top">
                <div class="profile-photo">
                    <img src="./images/profile-1.jpg" alt="">
                </div>
                <div class="info">
                    <p>Hey, <b>Alex</b> </p>
                    <small class="text-muted">12102030</small>
                </div>
            </div>
            <div class="about">
                <h5>Course</h5>
                <p>BTech. Computer Science & Engineering</p>
                <h5>DOB</h5>
                <p>29-Feb-2020</p>
                <h5>Contact</h5>
                <p>1234567890</p>
                <h5>Email</h5>
                <p>unknown@gmail.com</p>
                <h5>Address</h5>
                <p>Ghost town Road, New York, America</p>
            </div>
        </div>
    </aside>

    <main>
        <h1>Attendance</h1>
        <div class="subjects">

        </div>

        <div class="timetable" id="timetable">

        </div>
    </main>

    <div class="right">
        <div class="announcements">

        </div>

        <div class="leaves">

        </div>
    </div>
</div>

<script src="timeTable.js"></script>
<script src="app.js"></script>
</body>
</html>
