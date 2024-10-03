package src.ss12_map_tree.bai_tap.transport_management.controller;

import src.ss12_map_tree.bai_tap.transport_management.model.Car;
import src.ss12_map_tree.bai_tap.transport_management.service.CarService;
import src.ss12_map_tree.bai_tap.transport_management.service.ICarService;

import java.util.List;

public class CarController {
    private ICarService carService = new CarService();

    public void addCar(Car car) {
        carService.addCar(car);
    }

    public void displayCars() {
        List<Car> cars = carService.getAllCars();
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            for (Car car : cars) {
                System.out.println(car.toString());
            }
        }
    }

    public Car getCarByLicensePlate(String licensePlate) {
        return carService.getCarByLicensePlate(licensePlate);
    }

    public void deleteCar(String licensePlate) {
        carService.deleteCar(licensePlate);
    }
}
