package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // This will be the page we access when we hit 'http://localhost:8080/ - without any URL patterns to recognize
        // resp.setContentType("text/html");
        // PrintWriter out = resp.getWriter();

        // We'll only be printint a simple message showing that this is the home page
        // out.println("Welcome to Burgers 'R Us!");

        // TODO: After printing our simple message, let's step up our game and print out some awesome HTML instead, by utilizing some templates!
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        // the path is relative to our 'webapp' folder

    }
}
