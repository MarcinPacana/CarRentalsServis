package servlets;

import controllers.CarController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/oferta")
public class OfferServlet extends HttpServlet {

    CarController carController;

    OfferServlet(){
        this.carController = new CarController();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doGet(req, resp);
    }
}
