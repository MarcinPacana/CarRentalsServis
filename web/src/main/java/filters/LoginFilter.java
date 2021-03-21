package filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession(false);

        boolean isLoggedUserIn = session != null && session.getAttribute("user") != null;


        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
    }

}
