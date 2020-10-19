package model;

import encje.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateCfg {

    private static final HibernateCfg INSTANCE = new HibernateCfg();
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    public static HibernateCfg getInstance(){
        return INSTANCE;
    }

    private SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Reservation.class);
        configuration.addAnnotatedClass(Car.class);

        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;

    }

    public Session getSession(){
        return getSessionFactory().openSession();
    }
}
