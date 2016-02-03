import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by al on 27.01.2016.
 */
@WebServlet("admin")

public class AdminServlet extends HttpServlet {

    private int counter = 0;
//    private Integer sessionCounter;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doGet(request, response);
        Integer sessionCounter = (Integer) request.getSession().getAttribute("counter");
        if (sessionCounter == null)
            sessionCounter = 0;
        PrintWriter out = response.getWriter();
        out.print("<h1>admin page two</h1>");
        out.print("<h1>counter = " + counter + "</h1>");
        out.print("<h1>session counter = " + sessionCounter + "</h1>");
        sessionCounter+=1;
        request.getSession().setAttribute("counter", sessionCounter);
        counter++;
    }
}
