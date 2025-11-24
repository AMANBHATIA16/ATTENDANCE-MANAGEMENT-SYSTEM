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
    status VARCHAR(10),
    FOREIGN KEY(student_id) REFERENCES students(student_id)
);
