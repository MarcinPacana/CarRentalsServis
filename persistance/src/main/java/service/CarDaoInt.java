package service;

import encje.Car;

import java.util.List;

public interface CarDaoInt {

    void save(Car car);
    void delete(Car car);
    void update(Car car);
    public Car findById(Long id);
    public List<Car> getAll();
}
