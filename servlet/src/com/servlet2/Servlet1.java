package com.servlet2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("经过servlet1:"+username);
        req.setAttribute("key1","柜台1的章");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");

        //走向servlet2
        requestDispatcher.forward(req,resp);
    }
}
