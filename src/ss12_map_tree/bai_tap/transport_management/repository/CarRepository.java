package src.ss12_map_tree.bai_tap.transport_management.repository;

import src.ss12_map_tree.bai_tap.transport_management.model.Car;

import java.io.*;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class CarRepository{
    private static final String FILE_PATH = "D:\\codegym\\module2\\src\\src\\ss12_map_tree\\bai_tap\\transport_management\\repository\\cars.csv";
    private List<Car> carList = new ArrayList<>();

    public List<Car> getAllCars() {
        return carList;
    }

    public void addCar(Car car) {
        carList.add(car);
        writeToFile();
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Car car : carList) {
                writer.write(car.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        carList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                // Tách chuỗi thành các thông tin xe để tái tạo đối tượng Car
                String[] carData = line.split(",");
                if (carData.length!= 6) {
                    System.out.println("dữ liệu xe không đúng định dạng");
                }else {
                    String licensePlate = carData[0];
                    String manufacturer = carData[1];
                    int year = Integer.parseInt(carData[2]);
                    String owner = carData[3];
                    int seatNumber = Integer.parseInt(carData[4]);
                    String type = carData[5];
                    carList.add(new Car(seatNumber, type, licensePlate, manufacturer, year, owner));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
