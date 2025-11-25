package model;

import java.sql.Date;

public class Attendance {

    private int studentId;
    private Date date;
    private String status;

    public Attendance(int sid, Date d, String s) {
        this.studentId = sid;
        this.date = d;
        this.status = s;
    }

    public int getStudentId() { return studentId; }
    public Date getDate() { return date; }
    public String getStatus() { return status; }
}
