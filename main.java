import dao.*;
import model.*;
import service.*;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Connection conn = DBConnection.getConnection();
        StudentDAO studentDAO = new StudentDAO(conn);
        AttendanceDAO attendanceDAO = new AttendanceDAO(conn);
        AttendanceService service = new AttendanceService(studentDAO, attendanceDAO);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Attendance Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Mark Attendance");
            System.out.println("4. View Attendance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter course: ");
                    String course = sc.nextLine();
                    service.addStudent(name, course);
                    break;

                case 2:
                    List<Student> students = service.getAllStudents();
                    for (Student s : students) {
                        System.out.println(s.getStudentId() + " | " + s.getName() + " | " + s.getCourse());
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Status (Present/Absent): ");
                    String status = sc.nextLine();
                    service.markAttendance(id, status);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    List<Attendance> att = service.viewAttendance(sid);
                    for (Attendance a : att) {
                        System.out.println(a.getDate() + " | " + a.getStatus());
                    }
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

