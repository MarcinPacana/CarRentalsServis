package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "/home", urlPatterns = {"/home"})
public class indexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath();
        System.out.println("TO JEST contextPath "+contextPath);

        String requestURI = req.getRequestURI();
        System.out.println("TO JEST requestURI "+requestURI);

        boolean endWith = req.getRequestURI().endsWith("index.jsp");
        System.out.println(endWith);

        boolean endWith1 = req.getRequestURI().endsWith("home");
        System.out.println(endWith1);

        boolean b = req.getRequestURI().endsWith("admin.jsp");
        System.out.println(b);

        StringBuffer requestURL = req.getRequestURL();
        System.out.println("TO JEST requestURL: "+requestURL);


        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
