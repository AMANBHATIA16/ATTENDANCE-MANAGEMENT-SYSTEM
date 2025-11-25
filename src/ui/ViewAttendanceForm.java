package ui;

import model.Attendance;
import service.AttendanceService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ViewAttendanceForm extends JFrame {

    AttendanceService service = new AttendanceService();

    public ViewAttendanceForm() {
        setTitle("View Attendance");
        setSize(500, 400);

        String studentId = JOptionPane.showInputDialog("Enter Student ID:");

        String[] cols = {"Date", "Status"};
        DefaultTableModel model = new DefaultTableModel(cols, 0);

        JTable table = new JTable(model);
        JScrollPane pane = new JScrollPane(table);
        add(pane);

        List<Attendance> list = service.getAttendance(Integer.parseInt(studentId));
        for (Attendance a : list) {
            model.addRow(new Object[]{a.getDate(), a.getStatus()});
        }

        setVisible(true);
    }
}

