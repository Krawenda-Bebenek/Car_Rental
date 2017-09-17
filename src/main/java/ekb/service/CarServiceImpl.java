package ekb.service;

import ekb.dao.CarRepository;
import ekb.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void add(Car car) { carRepository.save(car); }

    @Override
    public void deleteCarById(Long id) {
        carRepository.delete(id);
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findOne(id);
    }

    @Override
    public void updateCar(Car client) {
        carRepository.save(client);
    }

    @Override
    public Collection<Car> getAllCars() {
        return carRepository.findAll();
    }

}
