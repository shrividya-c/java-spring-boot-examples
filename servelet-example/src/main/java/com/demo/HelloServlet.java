package com.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("servlet is running!");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h3>servlet says hello</h3>");
    }
}
