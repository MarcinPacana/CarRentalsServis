package servlets;

import controllers.LoginController;
import encje.User;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "/login",urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private LoginController loginController;

    public LoginServlet(){
        this.loginController = new LoginController();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        User user = loginController.logIn(email, pwd);

        if (user != null){
            HttpSession session = request.getSession(true);
            session.setAttribute("user",user);
            request.getRequestDispatcher("home").forward(request,response);
        }else {
            request.setAttribute("errorLogin","Wprowadziłeś złe hasło i/lub login");
            request.getRequestDispatcher("home").forward(request,response);
        }
    }
}
