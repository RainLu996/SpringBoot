package com.lujun61.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        /* 无论是get还是post，都可以响应请求 */
        doPost(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        /*resp.setContentType("text/html;charset=utf-8");*/
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("使用 Servlet 对象");

        out.flush();
        out.close();
    }

}
