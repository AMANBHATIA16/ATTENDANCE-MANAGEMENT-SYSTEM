# 📘 Attendance Management System
### Java Swing + JDBC + MySQL (Review-2)
A fully functional GUI-based Attendance Management System developed using Java Swing, JDBC, and MySQL.
The application allows administrators to manage students, record attendance, analyze attendance percentage, and view attendance history through a clean and interactive interface.
## ✨ Features

### ✅ Student Management
- Add new students  
- View all registered students  
- Auto-generated student IDs  
- Input validation for student details  

### ✅ Attendance Management
- Mark attendance (Present / Absent)  
- Automatically records date  
- View attendance history per student  

### ✅ Attendance Analytics (Review-2 Innovation)
- Calculate attendance percentage per student  
- Real-time percentage computation  
- Improves academic monitoring and reporting

## 🏗️ Architecture Highlights

- Layered Architecture (DAO, Service, UI)  
- JDBC-based persistence  
- Separation of concerns  
- Reusable and scalable codebase  
- Clean modular design
  
## 🗂️ Project Structure
│── src/
│   ├── controller/
│   │   ├── AttendanceServlet.java
│   │   └── StudentServlet.java
│   ├── dao/
│   │   ├── DBConnection.java
│   │   ├── StudentDAO.java
│   │   └── AttendanceDAO.java
│   ├── model/
│   │   ├── Student.java
│   │   └── Attendance.java
│   ├── service/
│   │   └── AttendanceService.java
│   ├── ui/
│   │   ├── MainMenu.java
│   │   ├── AddStudentForm.java
│   │   ├── ViewStudentsForm.java
│   │   ├── MarkAttendanceForm.java
│   │   └── ViewAttendanceForm.java
│   └── Main.java
│
│── resources/
│   └── db.properties
│
│── attendance.sql
│── README.md
## 🧰 Technologies Used

- **Java** – Programming Language  
- **Swing** – GUI Development  
- **JDBC** – Database Connectivity  
- **MySQL** – Relational Database  
- **DAO Pattern** – Data Access Layer  
- **MVC Architecture** – Code Organization  
- **Servlets** – Backend Processing (Review-2)
## 🗄️ Database Setup
CREATE DATABASE attendance_db;
USE attendance_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    course VARCHAR(100)
);

CREATE TABLE attendance (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    date DATE,
    status VARCHAR(20),
    FOREIGN KEY (student_id) REFERENCES students(student_id)
);
## 🔧 JDBC Configuration
Create the file:
resources/db.properties
Add the following:
db.url=jdbc:mysql://localhost:3306/attendance_db
db.username=root
db.password=YOUR_PASSWORD
db.driver=com.mysql.cj.jdbc.Driver
## 🚀 Running the Project in IntelliJ IDEA

### ▶ Step 1 — Open Project
- Open **IntelliJ IDEA**
- Click **File → Open**
- Select the `AttendanceManagementSystem` folder

### ▶ Step 2 — Mark Source Root
- Right-click on the `src` folder  
- Select **Mark Directory As → Sources Root**

### ▶ Step 3 — Add MySQL Connector JAR
- Go to **File → Project Structure**
- Select **Modules → Dependencies**
- Click **+ → JARs or Directories**
- Add **mysql-connector-j.jar**

### ▶ Step 4 — Run the Application
- Open `src/Main.java`
- Click the **Run ▶ button**

## 🖥️ GUI Screens

- Main Menu  
- Add Student  
- View Students  
- Mark Attendance  
- View Attendance  
- Attendance Percentage Analytics 
## 👥 Team Members

- **AMANDEEP SINGH BHATIA** – 24SCSE1011218  
- **YASH MISHRA** – 24SCSE1010914  
- **YASH VARDHAN SINGH RANA** – 24SCSE1010490  

## 📄 License
This project is developed strictly for educational purposes as part of academic evaluation.
