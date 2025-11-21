import service.AttendanceService;
import model.Student;
import model.Attendance;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        AttendanceService service = new AttendanceService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Attendance Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Mark Attendance");
            System.out.println("4. View Attendance");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    if (service.addStudent(roll, name))
                        System.out.println("Student Added!");
                    else
                        System.out.println("Failed!");
                    break;

                case 2:
                    List<Student> students = service.getStudents();
                    for (Student s : students)
                        System.out.println(s.getRoll() + " - " + s.getName());
                    break;

                case 3:
                    System.out.print("Enter Roll: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    System.out.print("Enter Status (P/A): ");
                    String status = sc.nextLine();

                    if (service.addAttendance(r, date, status))
                        System.out.println("Attendance Added!");
                    else
                        System.out.println("Failed!");
                    break;

                case 4:
                    System.out.print("Enter Roll: ");
                    int ro = sc.nextInt();
                    List<Attendance> attList = service.getAttendance(ro);

                    for (Attendance a : attList)
                        System.out.println(a.getDate() + " - " + a.getStatus());
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid!");
            }
        }
    }
}

