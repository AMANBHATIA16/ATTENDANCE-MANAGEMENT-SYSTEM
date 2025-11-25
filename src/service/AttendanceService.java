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
        studentDAO.addStudent(new Student(name, course));
    }

    public List<Student> getStudents() {
        return studentDAO.getAllStudents();
    }

    public void markAttendance(int studentId, String status) {
        attendanceDAO.markAttendance(
                new Attendance(studentId, new Date(System.currentTimeMillis()), status)
        );
    }

    public List<Attendance> getAttendance(int studentId) {
        return attendanceDAO.getAttendance(studentId);
    }
}

