package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="BurgerServlet", urlPatterns = "/burgers")
public class BurgerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // Assuming we have the burger as a parameter from the GET request, let's store it here
        String burger = req.getParameter("burger");

        if (burger == null || burger.isEmpty()) {
            // If the parameter isn't passed in, or if it's passed in with no value,
            //   we'll set the value to a nothing burger
            burger = "McNothing";
        }

        out.println("Your " + burger + " is ready!");


    }
}
