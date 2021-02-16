package com.servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("servlet2中的参数:"+username);

        //查看章
        Object key1 = req.getAttribute("key1");
        System.out.println("柜台1是否有章:"+key1);
        //处理自己的业务
        System.out.println("servlet2处理自己的业务");
    }
}
