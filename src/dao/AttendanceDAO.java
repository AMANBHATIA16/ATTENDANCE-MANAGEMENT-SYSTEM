package dao;

import model.Attendance;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AttendanceDAO {

    Connection conn = DBConnection.getConnection();

    public void markAttendance(Attendance a) {
        try {
            String query = "INSERT INTO attendance(student_id, date, status) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, a.getStudentId());
            ps.setDate(2, a.getDate());
            ps.setString(3, a.getStatus());
            ps.executeUpdate();
            System.out.println("Attendance marked!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Attendance> getAttendanceByStudent(int studentId) {
        List<Attendance> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM attendance WHERE student_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Attendance(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getDate("date"),
                        rs.getString("status")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

