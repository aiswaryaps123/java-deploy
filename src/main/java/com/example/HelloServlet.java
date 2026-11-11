package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>My Java Application</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to My First Java Application!</h1>");
        out.println("<h2>Successfully Deployed on Linux Server</h2>");
        out.println("<p>Powered by Java 17 and Apache Tomcat.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

