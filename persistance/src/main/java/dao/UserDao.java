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

    public UserDao() {
        this.session = HibernateCfg.getInstance().getSession();
    }


    @Override
    public void save(User user) {
        System.out.println("jestesmy w save "+user.getToken());
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.persist(user);
        transaction.commit();
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
    public User findByUserName(String userName) {
        session.clear();
        Query query = session.createQuery("select u from User u where u.firstName = :imie");
        query.setParameter("imie",userName);
        return (User) query.getResultList().get(0);
    }

    public User findUserByToken(String token){
        session.clear();
        Query query = session.createQuery("select u from User u where u.token = :token");
        query.setParameter("token",token);
        List<User> userList = query.getResultList();
        int size = userList.size();
        if (size == 0) return null;
        return (User) query.getResultList().get(0);
    }

    public User findUserByMail(String mail){
        session.clear();
        Query query = session.createQuery("select u from User u where u.mail = :mail");
        query.setParameter("mail",mail);
        return (User) query.getResultList().get(0);
    }

    public boolean mailExists(String mail){
        Query query = session.createQuery("select u.mail from User u where u.mail = :mail");
        query.setParameter("mail",mail);
        int size = query.getResultList().size();
        if (size == 0) return false;
        else return true;
    }

    public boolean getIsActiveByToken(String token){
        session.clear();
        Query query = session.createQuery("select u.isActive from User u where u.token = :token");
        query.setParameter("token",token);
        return (boolean) query.getResultList().get(0);
    }

    @Override
    public List<User> getAllUsers() {
        session.clear();
        return session.createQuery("select u from User u").list();
    }

    public User findByUserCity(String city){
        session.clear();
        return null;
    }
}
