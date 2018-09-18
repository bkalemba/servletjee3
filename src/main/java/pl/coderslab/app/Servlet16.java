package pl.coderslab.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet(name = "Servlet16",urlPatterns = "/Servlet16")

public class Servlet16 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(req.getHeader("host"));
        resp.getWriter().println(req.getHeader("user-agent"));
        resp.getWriter().println(LocalTime.now());
    }
}
