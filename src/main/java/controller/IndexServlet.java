package controller;

<<<<<<< HEAD
import model.Burger;

=======
>>>>>>> 0d9ff3167c45b6b6169cea17441da2631cdbcef7
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/home")
public class IndexServlet extends HttpServlet {
    // we want to display our 'home page' using this servlet, when someone loads
    //  'http://localhost:8080/'

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // this is where we want to tell the Tomcat server to display the webapp/index.jsp template file (as a webpage)

        // The BORING way
        // resp.setContentType("text/html");

        // resp.getWriter().println("<h1>Welcome to Burgers 'R Us!</h1>");
        // END: The BORING way

        // Let's make some burgers, add them all to a list, and send them to index.jsp for looping through
        Burger bigMac = new Burger("Big Mac", 3, 7, 2, true);
        Burger homestyle = new Burger("Homestyle", 2, 3, 1, false);
        Burger quarterPounder = new Burger("Quarter Pounder", 2, 3, 1, true);

        // Add all the burgers to a list
        List<Burger> allBurgers = new ArrayList<>();
        allBurgers.add(bigMac);
        allBurgers.add(homestyle);
        allBurgers.add(quarterPounder);

        // Send that list to our JSP page, as a parameter
        // Name in "quotes" is the variable name we'll use in our JSP,
        // and the second argument is the actual value we are sending to JSP
        req.setAttribute("completeBurgerList", allBurgers);
        req.setAttribute("truthiness", false);

        // The FUN way!!
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        // we want to load the index.jsp template, when this Servlet is called upon
        // END: The FUN way!!
=======

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

>>>>>>> 0d9ff3167c45b6b6169cea17441da2631cdbcef7
    }
}
