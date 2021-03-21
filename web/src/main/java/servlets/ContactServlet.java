package servlets;

import controllers.MsgSender;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/kontakt")
public class ContactServlet extends HttpServlet {

    private MsgSender msgSender;

    public ContactServlet(){
        this.msgSender = new MsgSender();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("contact.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String contentMsg = req.getParameter("contentMsg");
        String mail = req.getParameter("mail");


       boolean sendOK = false;
        try {
            sendOK = msgSender.send(mail, title, contentMsg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        if(sendOK == true){
            resp.sendRedirect("alertConfirmOK.jsp");
        }

}
}
