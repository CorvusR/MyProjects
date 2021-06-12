package servlet;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.HttpJspPage;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.print("hello,world");
        ServletContext servletContext = this.getServletContext();
        servletContext.getRequestDispatcher("hello").forward(req, resp);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] parameterValues = req.getParameterValues("hobbies");
        Cookie[] cookies = req.getCookies();
        Cookie cookie = new Cookie("","");
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
