package com.servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequseAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("请求资源路径"+req.getRequestURI());
        System.out.println("获取请求的统一资源定位符（绝对路径）"+req.getRequestURL());
        System.out.println("客户端IP "+req.getRemoteHost());
        System.out.println("请求头User-agent: "+req.getHeader("User-agent"));
        System.out.println("请求方式"+req.getMethod());
    }
}
