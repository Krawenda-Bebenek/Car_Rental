package ekb.controller;

import ekb.entity.Car;
import ekb.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/carservice")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCar(@RequestBody Car car) {
        carService.add(car);
    }


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Car car) {
        carService.updateCar(car);
    }


    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
    }


    @RequestMapping(method = RequestMethod.GET, value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Car> getAllCars() {
        return carService.getAllCars();}

}
