package servlets;

import controllers.NewUserController;
import encje.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

   private NewUserController newUserController;

    public RegisterServlet(){
        this.newUserController = new NewUserController();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("registration.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        boolean isEmail = newUserController.emailExist(email);

        if (isEmail){
            req.setAttribute("isEmail",isEmail);
            req.getRequestDispatcher("registration.jsp").forward(req,resp);
        }else {
            User user = new User();
            user.setFirstName(req.getParameter("name"));
            user.setLastName(req.getParameter("surname"));
            String date = req.getParameter("birthday");
            LocalDate birthday = LocalDate.parse(date);
            user.setBirthOfDay(birthday);
            user.setMail(req.getParameter("email"));
            user.setPassword(req.getParameter("pwd1"));
            user.setActive(false);

            boolean userAdded = newUserController.addNewUser(user);

            req.setAttribute("userAdded",userAdded);
            req.getRequestDispatcher("registration.jsp").forward(req,resp);
        }
    }
}
