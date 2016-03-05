package org.myServlets;

import org.StoreBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by al on 05.03.2016.
 */

@WebServlet(urlPatterns = "/Store")
public class Store extends HttpServlet {

    @EJB
    StoreBean storeBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String description = req.getParameter("description");
        if (description != null)
            storeBean.setDescription(description);

        String storedInfo = req.getParameter("storedInfo");
        if (storedInfo != null)
            storeBean.setStoredInfo(storedInfo);

        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("Store");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div align=\"center\">");
        out.print("<h3>");
        out.print("There you can store a value and it's description");
        out.print("</h3>");
        out.print("<form action=\"Store\" method=\"GET\">");
        out.print("<div>");
        out.print("<p>description of value</p><input type=\"text\" name=\"description\" value=\""+storeBean.getDescription()+"\"/>");
        out.print("</div>");
        out.print("<div>");
        out.print("<p>stored value</p><input type=\"text\" name=\"storedInfo\" value=\""+storeBean.getStoredInfo()+"\"/>");
        out.print("</div>");
        out.print("<br>");
        out.print("<input type=\"submit\" value=\"save data\"/>");
        out.print("</form>");
        out.print("<form action=\"index.jsp\">\n" +
                "        <input type=\"submit\" value=\"back to start\">\n" +
                "    </form>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");

    }
}
