package model;


import org.hibernate.Session;


public class Start {
    public static void main(String[] args) {

        Session session = HibernateCfg.getInstance().getSession();



    }
}
