package model;


import dao.AddressDao;
import dao.UserDao;
import encje.Address;
import encje.User;
import org.hibernate.Session;


public class Start {
    public static void main(String[] args) {

        Session session = HibernateCfg.getInstance().getSession();

        UserDao userDao = new UserDao();
        User user1 = userDao.findByUserId(17l);
        String token = user1.getToken();
        System.out.println(token);


    }
}
