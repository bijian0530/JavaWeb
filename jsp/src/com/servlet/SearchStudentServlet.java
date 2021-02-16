package com.servlet;

import com.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int t =i+1;
            studentsList.add(new Student(t,"name"+t,18+t,"phone"+t));
        }
        req.setAttribute("stdList",studentsList);
        req.getRequestDispatcher("/test/showStudent.jsp").forward(req,resp);
    }
}
