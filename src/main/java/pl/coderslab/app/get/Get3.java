package pl.coderslab.app.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get3", urlPatterns = "/get3")
public class Get3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 5;
        int heigth = 10;
        try {
            width = Integer.parseInt(request.getParameter("width"));
        } catch (NumberFormatException e) {

        }
        try {
            heigth = Integer.parseInt(request.getParameter("heigth"));
        } catch (NumberFormatException e) {

        }
        for (int i = 1; i <= heigth; i++) {
            for (int j = 1; j <= width; j++) {
                response.getWriter().print(i * j + "\t");
            }
            response.getWriter().println();
        }
    }

}
