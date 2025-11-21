# 📘 Attendance Management System (Java + JDBC)

A simple and modular **Attendance Management System** built using **Java**, **JDBC**, and **MySQL**.  
This console-based application allows you to manage students, record attendance, and view attendance reports efficiently.

---

## 🚀 Features
- ➕ Add new student  
- 📋 View all students  
- 🗓️ Mark attendance (Present/Absent)  
- 📅 View attendance history of each student  
- 🧱 Layered architecture (DAO → Service → Main)  
- 🗄️ MySQL database integration  
- 🔧 Modular and clean code  

---

## 🏗️ Project Structure
AttendanceManagementSystem/
│── src/
│ ├── dao/
│ │ ├── DBConnection.java
│ │ ├── StudentDAO.java
│ │ └── AttendanceDAO.java
│ ├── model/
│ │ ├── Student.java
│ │ └── Attendance.java
│ ├── service/
│ │ └── AttendanceService.java
│ └── Main.java
│
│── resources/
│ └── db.properties
│
│── docs/
│ └── presentation.pdf
│
│── attendance.sql
│── README.md
└── pom.xml

---

## 🗄️ Database Schema (MySQL)

### Create Database
```sql
CREATE DATABASE attendance_db;
USE attendance_db;
###Students Table
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    course VARCHAR(100)
);
###Attendance Table
CREATE TABLE attendance (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    date DATE,
    status VARCHAR(10),
    FOREIGN KEY(student_id) REFERENCES students(student_id)
);
###🔧 JDBC Configuration
Add these lines in resources/db.properties:
db.url=jdbc:mysql://localhost:3306/attendance_db
db.username=root
db.password=your_password
db.driver=com.mysql.cj.jdbc.Driver
### ▶️ How to Run
1. Clone the Repository
git clone https://github.com/yourusername/AttendanceManagementSystem.git
cd AttendanceManagementSystem
2. Import Database
Run the SQL file:
mysql -u root -p attendance_db < attendance.sql
3. Add MySQL Connector
If using Maven:
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.0.33</version>
</dependency>
Without Maven:
Download MySQL Connector JAR
Add it to project classpath
4. Run the Program
Using Terminal:
javac Main.java
java Main
OR using IDE:
IntelliJ / Eclipse / NetBeans
### 📸 Sample Output
===== Attendance Management System =====
1. Add Student
2. View Students
3. Mark Attendance
4. View Attendance
5. Exit
Enter choice:
  Technologies Used
Java
JDBC
MySQL
SQL
OOP Principles
Maven (optional)
###📂 Documentation
Project presentation is available in:
/docs/presentation.pdf
###👥 Team Members
Member 1 – Roll No
Member 2 – Roll No
Member 3 – Roll No
###📄 License
This project is for educational purposes only.
###⭐ Contribute
Contributions are welcome!
Feel free to open issues or submit pull requests.
