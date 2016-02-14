import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by al on 26.01.2016.
 */

public class AuthServlet extends HttpServlet {

    @EJB
    InfoBean infoBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<h2>parameters: </h2>");
        for (Map.Entry<String, String[]> entry : req.getParameterMap().entrySet()) {
            out.println("key = " + entry.getKey()
                    +" value = " + entry.getValue()[0]
                    +"</br>");
        }
        out.print("<p>session attributes: </p>");
        Enumeration<String> attr = req.getSession().getAttributeNames();
        while (attr.hasMoreElements()) {
            out.print(attr.nextElement());
        }
        out.print("<form method=\"post\" action=\"index.jsp\">" +
                "<input type=\"submit\" name=\"submit\" value=\"back to start\">" +
                "</form>");
        out.print(infoBean.getSomeStr());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
