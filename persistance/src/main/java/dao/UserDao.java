package dao;

import encje.User;
import model.HibernateCfg;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import service.UserDaoInt;
import java.util.List;

public class UserDao implements UserDaoInt {

    private final Session session;

    public UserDao(Session session) {
        this.session = HibernateCfg.getInstance().getSession();
    }


    @Override
    public void save(User user) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(User user) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.update(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    @Override
    public User findByUserId(Long userId) {
        session.clear();
        return session.find(User.class,userId);
    }

    @Override
    public List<User> findByUserName(String userName) {
        session.clear();
        Query query = session.createQuery("select u from User u where u.firstName = :imie");
        query.setParameter("imie",userName);
        return query.getResultList();
    }

    public boolean mailExists(String mail){
        Query query = session.createQuery("select u.mail from User u where u.mail = :mail");
        query.setParameter("mail",mail);
        List list = query.list();
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        session.clear();
        return session.createQuery("from User",User.class).list();
    }

    public User findByUserCity(String city){
        session.clear();

        return null;
    }
}
