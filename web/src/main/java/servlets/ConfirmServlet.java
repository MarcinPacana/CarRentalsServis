package servlets;

import controllers.NewUserController;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class ConfirmServlet extends HttpServlet {

    private NewUserController newUserController = new NewUserController();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String token = request.getParameter("token");
        boolean activated = newUserController.activateUser(token);
        if (activated) {
            request.getRequestDispatcher("alerts/alertConfirmOK.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("alerts/alertPageNotExist.jsp").forward(request,response);
        }
    }
}