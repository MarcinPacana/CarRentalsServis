package servlets;

import controllers.NewUserController;
import encje.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateUserServlet", value = "/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {

    private final NewUserController newUserController;

    public UpdateUserServlet() {
        this.newUserController = new NewUserController();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        user.setFirstName(request.getParameter("name"));
        user.setLastName(request.getParameter("lastName"));
        String email = request.getParameter("email");
        boolean emailExist = newUserController.emailExist(email);
        if (emailExist){
            request.setAttribute("isEmail",true);
            request.getRequestDispatcher("user").forward(request,response);
        }else {
            user.setMail(request.getParameter("email"));
            newUserController.update(user);
            request.getRequestDispatcher("user").forward(request,response);
        }
    }
}
