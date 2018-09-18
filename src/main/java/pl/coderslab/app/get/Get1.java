package pl.coderslab.app.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get1", urlPatterns = "/get1")
public class Get1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strStart = request.getParameter("start");
        String strEnd = request.getParameter("end");
        if (strStart != null && strEnd != null) {
            try {
                int start = Integer.parseInt(strStart);
                int end = Integer.parseInt(strEnd);
                for (int i = start; i <= end; i++) {
                    response.getWriter().println(i);
                }
            } catch (NumberFormatException e) {
                response.getWriter().println("Niepoprawne dane.");
            }
        } else {
            response.getWriter().println("Brak przesłanych zmiennych");
        }
    }

}
