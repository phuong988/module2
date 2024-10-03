package src.ss12_map_tree.bai_tap.transport_management.service;

import src.ss12_map_tree.bai_tap.transport_management.model.Car;
import src.ss12_map_tree.bai_tap.transport_management.repository.CarRepository;

import java.util.List;

public class CarService implements ICarService {
    private final CarRepository carRepository = new CarRepository();  // chuyển sang CarRepository để tương tác với file CSV;
    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public List<Car> getAllCars() {
        carRepository.readFromFile();
        return carRepository.getAllCars();
    }

    @Override
    public void displayCars() {
        List<Car> cars = carRepository.getAllCars();
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public Car getCarByLicensePlate(String licensePlate) {
        for (Car car : carRepository.getAllCars()) {
            if (car.getLicensePlates().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void deleteCar(String licensePlate) {
        List<Car> cars = carRepository.getAllCars();
        cars.removeIf(car -> car.getLicensePlates().equals(licensePlate));
        carRepository.writeToFile();
    }
}
