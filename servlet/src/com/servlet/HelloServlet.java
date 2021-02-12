package com.servlet;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1 构造器方法");
    }

    /**
     *
     * @param servletConfig
     * @throws ServletException
     */

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2 init初始化方法");
        //1.获取Servlet程序的别名servlet-name的值
        System.out.println("HelloServlet程序的别名"+servletConfig.getServletName());
        //2.获取初始化参数init-param
        System.out.println("初始化username的值"+servletConfig.getInitParameter("username"));
        //3.获取ServletContext
        System.out.println("初始化参数url的值"+servletConfig.getInitParameter("url"));
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3 HelloServlet 被访问了!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4 destroy销毁方法");
    }


}
