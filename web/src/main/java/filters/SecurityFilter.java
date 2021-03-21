package filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SecurityFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest servletRequest = (HttpServletRequest) req;
        String jsp = ".jsp";
        boolean isJspPage = servletRequest.getRequestURI().endsWith(".jsp");
        System.out.println("od filtra "+isJspPage);
        if (isJspPage){
            req.getRequestDispatcher("/home").forward(req,resp);
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
