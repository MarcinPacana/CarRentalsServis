package dao;

import encje.Reservation;
import encje.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import service.ReservationDaoInt;

import java.util.List;

public class ReservationDao implements ReservationDaoInt {

    private final Session session;

    public ReservationDao(Session session){
        this.session = session;
    }

    @Override
    public List<Reservation> getAll() {
        session.clear();
        return session.createQuery("from Reservation",Reservation.class).list();
    }

    public void save (Reservation reservation){
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.persist(reservation);
        transaction.commit();

    }

    public Reservation findById(Long id){
        session.clear();
        return session.find(Reservation.class,id);
    }

    public List<Reservation> getReservationByUser(User user){
        session.clear();
        return null;
    }
}
