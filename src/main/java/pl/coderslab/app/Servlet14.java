package pl.coderslab.app;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "Servlet14",urlPatterns = "/Servlet14")

public class Servlet14 extends HttpServlet {

    public void init(){
        System.out.println("Zadanie 4");
    }
}
