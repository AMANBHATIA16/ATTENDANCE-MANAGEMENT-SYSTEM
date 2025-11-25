package ui;

import service.AttendanceService;

import javax.swing.*;

public class MarkAttendanceForm extends JFrame {

    AttendanceService service = new AttendanceService();

    public MarkAttendanceForm() {
        setTitle("Mark Attendance");
        setSize(350, 250);
        setLayout(null);

        JLabel lbl1 = new JLabel("Student ID:");
        JTextField idField = new JTextField();
        JLabel lbl2 = new JLabel("Status:");
        JComboBox<String> statusBox = new JComboBox<>(new String[]{"Present", "Absent"});
        JButton markBtn = new JButton("Mark");

        lbl1.setBounds(40, 40, 120, 30);
        idField.setBounds(150, 40, 120, 30);
        lbl2.setBounds(40, 90, 120, 30);
        statusBox.setBounds(150, 90, 120, 30);
        markBtn.setBounds(100, 150, 120, 30);

        add(lbl1); add(idField);
        add(lbl2); add(statusBox);
        add(markBtn);

        markBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String status = statusBox.getSelectedItem().toString();
            service.markAttendance(id, status);
            JOptionPane.showMessageDialog(this, "Attendance Marked!");
        });

        setVisible(true);
    }
}

