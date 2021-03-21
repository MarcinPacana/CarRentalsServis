package filters;

import javax.servlet.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class AdminAuthenticationFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession(false);

        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        boolean isLoggedIn = (session != null && session.getAttribute("adminUser") != null);
        String loginURI = httpServletRequest.getContextPath()+"/login";

        boolean isLoginRequest = httpServletRequest.getRequestURI().equals(loginURI);
        boolean isLoginPage = httpServletRequest.getRequestURI().endsWith("login.jsp");

        if (isLoggedIn && (isLoginRequest || isLoginPage)){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/adminPanel.jsp");
            dispatcher.forward(request,response);
        }else if (isLoggedIn || isLoginRequest){
            chain.doFilter(request,response);
        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request,response);
        }


        chain.doFilter(request, response);
    }
}
