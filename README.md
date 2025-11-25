# 📘 Attendance Management System (Java Swing + JDBC + MySQL)

A fully functional **GUI-based Attendance Management System** built using **Java, Swing, JDBC, and MySQL**.  
This system allows you to **add students, mark attendance, view students, and view attendance history** through an easy-to-use graphical interface.

---

## 🌟 Features

### ✅ Student Management
- Add new student  
- View all students  
- Auto-generated student IDs  

### ✅ Attendance Management
- Mark attendance (Present/Absent)  
- Automatically records date  
- View attendance history  

### ✅ Technical Highlights
- Java Swing GUI  
- JDBC connectivity  
- DAO architecture  
- Service + Model + UI Layers  
- Fully modular & scalable  

---

## 🗂️ Project Structure

```
AttendanceManagementSystem/
│── src/
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
```

---

## 🧰 Technologies Used

| Technology | Purpose |
|-----------|----------|
| Java | Programming |
| Swing | GUI |
| JDBC | DB Connection |
| MySQL | Database |
| DAO Pattern | Data Access |
| MVC Structure | Code Organization |

---

## 🗄️ MySQL Database Setup

Run this SQL script:

```sql
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
    FOREIGN KEY(student_id) REFERENCES students(student_id)
);
```

---

## 🔧 JDBC Configuration

Create a file:

```
resources/db.properties
```

Add:

```properties
db.url=jdbc:mysql://localhost:3306/attendance_db
db.username=root
db.password=YOUR_PASSWORD
db.driver=com.mysql.cj.jdbc.Driver
```

Replace `YOUR_PASSWORD` with your MySQL password.

---

## 🚀 Running in IntelliJ IDEA

### ✔ Step 1 — Open Project  
File → Open → Select `AttendanceManagementSystem`

### ✔ Step 2 — Mark Source Root  
Right-click `src` → **Mark Directory As → Sources Root**

### ✔ Step 3 — Add MySQL JAR  
File → Project Structure → Modules → Dependencies → `+` → Add JAR

### ✔ Step 4 — Run  
Open:

```
src/Main.java
```

Click Run ▶

---

## 🖥️ GUI Screens

- Main Menu  
- Add Student  
- View Students  
- Mark Attendance  
- View Attendance  

---

## 👥 Team Members

- **AMANDEEP SINGH BHATIA – 24scse1011218**  
- **YASH MISHRA – 24scse1010914**  
- **YASH VARDHAN SINGH RANA – 24scse1010490**

---

## 📄 License
Educational Purposes Only.


