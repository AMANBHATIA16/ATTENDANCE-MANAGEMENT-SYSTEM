package service;

import dao.StudentDAO;
import dao.AttendanceDAO;
import model.Student;
import model.Attendance;

import java.sql.Date;
import java.util.List;

public class AttendanceService {

    StudentDAO studentDAO = new StudentDAO();
    AttendanceDAO attendanceDAO = new AttendanceDAO();

    public void addStudent(String name, String course) {
        Student s = new Student(name, course);
        studentDAO.addStudent(s);
    }

    public void viewStudents() {
        List<Student> list = studentDAO.getAllStudents();
        for (Student s : list) {
            System.out.println(s.getStudentId() + " | " + s.getName() + " | " + s.getCourse());
        }
    }

    public void markAttendance(int studentId, String status) {
        Attendance a = new Attendance(studentId, new Date(System.currentTimeMillis()), status);
        attendanceDAO.markAttendance(a);
    }

    public void viewAttendance(int studentId) {
        List<Attendance> list = attendanceDAO.getAttendanceByStudent(studentId);
        for (Attendance a : list) {
            System.out.println(a.getDate() + " - " + a.getStatus());
        }
    }
}

