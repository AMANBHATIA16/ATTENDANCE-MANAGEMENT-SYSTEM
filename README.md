# 📘 Attendance Management System  
## Java Swing + JDBC + MySQL (Review-2 Ready)

A fully functional **GUI-based Attendance Management System** developed using **Java**, **Swing**, **JDBC**, and **MySQL**.  
The project follows **MVC + DAO architecture**, includes **attendance analytics**, and is structured to meet **Review-2 evaluation criteria**.

---

## 🌟 Project Overview

The Attendance Management System provides a user-friendly graphical interface to manage student records and attendance efficiently.  
It demonstrates clean code practices, layered architecture, database integration, and innovation through analytics.

---

## ✅ Core Features

### 👨‍🎓 Student Management
- Add new students  
- View all students  
- Auto-generated student IDs  
- Course-wise records  

### 📅 Attendance Management
- Mark attendance (Present / Absent)  
- Automatically stores date  
- View attendance history per student  

### 📊 Attendance Percentage & Analytics (Innovation)
- Calculates attendance percentage for each student  
- Uses SQL aggregation functions  
- Displays analytics through GUI / service layer  

---

## 🧠 Technical Highlights

- Java Swing for GUI  
- JDBC for database connectivity  
- DAO (Data Access Object) pattern  
- MVC + Service-layer architecture  
- Modular, scalable, and maintainable code  
- Servlet-ready backend design (Review-2)  

---

## 🗂️ Project Structure

```text
AttendanceManagementSystem/
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

| Technology | Purpose |
|----------|---------|
| Java | Programming Language |
| Swing | GUI Development |
| JDBC | Database Connectivity |
| MySQL | Relational Database |
| DAO Pattern | Data Access |
| MVC | Code Organization |

---

## 🗄️ Database Setup

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
    FOREIGN KEY (student_id) REFERENCES students(student_id)
);
##🔧 JDBC Configuration
db.url=jdbc:mysql://localhost:3306/attendance_db
db.username=root
db.password=YOUR_PASSWORD
db.driver=com.mysql.cj.jdbc.Driver
##🚀 How to Run the Project (IntelliJ IDEA)
Open IntelliJ IDEA
File → Open → Select project folder
Right-click src → Mark Directory as Sources Root
Add MySQL Connector JAR
Run Main.java
##🛡 Error Handling & Validation
• Exception handling using try-catch
• Input validation in GUI forms
• Prevents invalid data entry and crashes
##🧼 Code Quality & Execution
• Layered MVC architecture
• Clean separation of concerns
• Reusable service methods
• Secure JDBC access
##🧩 Servlet Integration (Review-2)
• AttendanceServlet and StudentServlet
• Controller → Service → DAO workflow
• Web-extension ready backend
##💡 Innovation / Extra Effort
• Attendance percentage analytics
• Hybrid GUI + Servlet design
• Easily extendable architecture
##📊 Review-2 Rubric Mapping
Evaluation Criteria	Status
Servlet Implementation	✅
Code Quality & Execution	✅
Innovation / Extra Effort	✅
##👥 Team Members
AMANDEEP SINGH BHATIA – 24SCSE1011218
YASH MISHRA – 24SCSE1010914
YASH VARDHAN SINGH RANA – 24SCSE1010490
##📄 License
Educational purposes only.
