package main;

import service.AttendanceService;
import java.util.Scanner;

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
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    service.addStudent(name, course);
                    break;

                case 2:
                    service.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Status (Present/Absent): ");
                    String status = sc.nextLine();
                    service.markAttendance(id, status);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    service.viewAttendance(sid);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}

