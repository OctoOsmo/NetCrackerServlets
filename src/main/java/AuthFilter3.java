import org.StoreBean;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by al on 03.02.2016.
 */
@WebFilter(urlPatterns = {"/auth"})
public class AuthFilter3 implements Filter {

    Map<String, String> authInfo = new HashMap<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        authInfo.put("one", "passone");
        authInfo.put("a", "passa");
        authInfo.put("b", "passb");
        authInfo.put("c", "passc");
        authInfo.put("login", "password");
        authInfo.put("l", "p");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String login = servletRequest.getParameter("login");
        String pass = servletRequest.getParameter("password");
        if (authInfo.containsKey(login) && authInfo.get(login).equals(pass))
        {
            servletRequest.setAttribute("Filtered", "True");
            PrintWriter out = servletResponse.getWriter();
            out.println("<h1>Annotation filter string</h1>");
            out.println("<p>login = "+login+"</p>");
            out.println("<p>password = "+pass+"</p>");
            out.println("<p>stored password = "+authInfo.get(login)+"</p>");
            filterChain.doFilter(servletRequest, servletResponse);
        }else{
            ((HttpServletResponse) servletResponse).sendRedirect("LoginError.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
