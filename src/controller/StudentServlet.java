package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import service.AttendanceService;
import java.io.IOException;

@WebServlet("/addStudent")
public class StudentServlet extends HttpServlet {

    private AttendanceService service;

    @Override
    public void init() {
        service = new AttendanceService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String course = req.getParameter("course");

        if (name == null || name.trim().isEmpty()) {
            resp.getWriter().println("Invalid name");
            return;
        }

        service.addStudent(name, course);
        resp.getWriter().println("Student added successfully");
    }
}

