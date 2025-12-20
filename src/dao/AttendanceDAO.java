package dao;

import model.Attendance;
import java.sql.*;
import java.util.*;

public class AttendanceDAO {

    public void markAttendance(Attendance a) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO attendance(student_id, date, status) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, a.getStudentId());
            ps.setDate(2, a.getDate());
            ps.setString(3, a.getStatus());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Attendance> getAttendance(int studentId) {
        List<Attendance> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM attendance WHERE student_id=?");
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Attendance(
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
    public double getAttendancePercentage(int studentId) {
    double percentage = 0.0;

    String totalSQL =
        "SELECT COUNT(*) FROM attendance WHERE student_id=?";
    String presentSQL =
        "SELECT COUNT(*) FROM attendance WHERE student_id=? AND status='Present'";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement psTotal = con.prepareStatement(totalSQL);
         PreparedStatement psPresent = con.prepareStatement(presentSQL)) {

        psTotal.setInt(1, studentId);
        psPresent.setInt(1, studentId);

        ResultSet rsTotal = psTotal.executeQuery();
        ResultSet rsPresent = psPresent.executeQuery();

        if (rsTotal.next() && rsPresent.next()) {
            int total = rsTotal.getInt(1);
            int present = rsPresent.getInt(1);

            if (total > 0) {
                percentage = (present * 100.0) / total;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return percentage;
}
}

