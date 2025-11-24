package dao;

import java.sql.*;
import java.util.*;
import model.Attendance;

public class AttendanceDAO {

    private Connection conn;

    public AttendanceDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean markAttendance(Attendance a) {
        String sql = "INSERT INTO attendance(student_id, date, status) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, a.getStudentId());
            ps.setDate(2, Date.valueOf(a.getDate()));
            ps.setString(3, a.getStatus());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Attendance> getAttendanceByStudent(int studentId) {
        List<Attendance> list = new ArrayList<>();
        String sql = "SELECT * FROM attendance WHERE student_id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Attendance a = new Attendance(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getDate("date").toLocalDate(),
                        rs.getString("status")
                );
                list.add(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}

