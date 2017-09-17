package ekb.service;

import ekb.entity.Car;

import java.util.Collection;


public interface CarService {
    void add(Car car);
    void deleteCarById(Long id);
    Car getCarById(Long id);
    void updateCar(Car car);
    Collection <Car> getAllCars() ;
}
