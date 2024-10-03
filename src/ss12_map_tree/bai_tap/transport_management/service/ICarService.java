package src.ss12_map_tree.bai_tap.transport_management.service;
import src.ss12_map_tree.bai_tap.transport_management.model.Car;

import java.util.List;

public interface ICarService {
    void addCar(Car car);
    List<Car> getAllCars();
    void displayCars();
    Car getCarByLicensePlate(String licensePlate);
    void deleteCar(String licensePlate);
}
