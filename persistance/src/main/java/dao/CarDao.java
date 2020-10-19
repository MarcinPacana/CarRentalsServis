package dao;

import encje.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;
import service.CarDaoInt;
import java.util.List;

public class CarDao implements CarDaoInt {

    private final Session session;

    public CarDao(Session session) {
        this.session = session;
    }

    @Override
    public void save(Car car) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(car);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Car car) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.delete(car);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Car car) {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.update(car);
        transaction.commit();
        session.close();
    }

    @Override
    public Car findById(Long id) {
        session.clear();
        return session.find(Car.class,id);
    }

    @Override
    public List<Car> getAll() {
        session.clear();
        return session.createQuery("from Car",Car.class).list();
    }
}
