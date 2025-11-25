package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Student;
import service.AttendanceService;
import java.util.List;

public class ViewStudentsForm extends JFrame {

    AttendanceService service = new AttendanceService();

    public ViewStudentsForm() {
        setTitle("View Students");
        setSize(500, 400);

        String[] cols = {"ID", "Name", "Course"};
        DefaultTableModel model = new DefaultTableModel(cols, 0);

        JTable table = new JTable(model);
        JScrollPane pane = new JScrollPane(table);
        add(pane);

        List<Student> list = service.getStudents();
        for (Student s : list) {
            model.addRow(new Object[]{
                    s.getStudentId(),
                    s.getName(),
                    s.getCourse()
            });
        }

        setVisible(true);
    }
}

