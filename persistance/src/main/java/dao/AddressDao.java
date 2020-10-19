package dao;

import encje.Address;
import model.HibernateCfg;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import service.AddressDaoInt;

import java.util.List;

public class AddressDao implements AddressDaoInt {

    private final Session session;

   public AddressDao(Session session){
        this.session = HibernateCfg.getInstance().getSession();
    }


    @Override
    public void save(Address address) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(address);
        transaction.commit();
        session.clear();
    }

    @Override
    public void update(Address address) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.update(address);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Address address) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.delete(address);
        transaction.commit();
        session.close();
    }

    @Override
    public Address findByAddressId(Long id) {
        session.clear();
        return session.find(Address.class,id);
    }

    @Override
    public List<Address> findByAddressCity(String city) {
       session.clear();
       Query query = session.createQuery("select a from Address a where a.city = :miasto");
       query.setParameter("miasto",city);
        return query.getResultList();
    }

    @Override
    public List<Address> findByAddressZipcode(int zipCode) {
       session.clear();
       Query query = session.createQuery("select a from Address a where a.zipCode = :kodPocztowy");
       query.setParameter("kodPocztowy",zipCode);
       return query.getResultList();
    }

    @Override
    public List<Address> findByAddressStreet(String street) {
        session.clear();
        Query query = session.createQuery("select a from Address a where a.street = :ulica");
        query.setParameter("ulica",street);
        return query.getResultList();
    }


}
