package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import service.AttendanceService;

import java.io.IOException;

@WebServlet("/markAttendance")
public class AttendanceServlet extends HttpServlet {

    private AttendanceService service;

    @Override
    public void init() {
        service = new AttendanceService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int studentId = Integer.parseInt(req.getParameter("studentId"));
        String status = req.getParameter("status"); // Present / Absent

        service.markAttendance(studentId, status);

        resp.getWriter().println("Attendance marked successfully");
    }
}
