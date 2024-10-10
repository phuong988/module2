package ss20.bai_tap.transportMangement.repository;

import ss20.bai_tap.transportMangement.utils.ReadWriteFile;
import ss20.bai_tap.transportMangement.model.Motorcycle;
import java.util.List;
import java.util.ArrayList;

public class MotorbikeRepository implements IVehicleRepository<Motorcycle> {
    private final String FILE_MOTORCYCLE = "src/demo_case/quan_ly_phuong_tien/data/motorcycle.csv";

    @Override
    public void writeFile(List<Motorcycle> list) {
        List<String> stringList = new ArrayList<>();
        for (Motorcycle motorcycle : list) {
            stringList.add(motorcycle.csvMotorcycle());
        }
        ReadWriteFile.writeFile(FILE_MOTORCYCLE, stringList, false);
    }

    @Override
    public List<Motorcycle> findAll() {
        List<String> stringList = ReadWriteFile.readFile(FILE_MOTORCYCLE);
        List<Motorcycle> motorcycleList = new ArrayList<>();
        for (String line : stringList) {
            String[] arr = line.split(",");
            String licensePlate = arr[0];
            String nameManufacturer = arr[1];
            int year = Integer.parseInt(arr[2]);
            String owner = arr[3];
            int capacity = Integer.parseInt(arr[4]);

            Motorcycle motorcycle = new Motorcycle(licensePlate, nameManufacturer, year, owner, capacity);
            motorcycleList.add(motorcycle);
        }
        return motorcycleList;
    }

    @Override
    public void add(Motorcycle entity) {
        List<Motorcycle> motorcycleList = findAll();
        motorcycleList.add(entity);

        writeFile(motorcycleList);
    }

    @Override
    public void delete(Motorcycle entity) {
        List<Motorcycle> motorcycleList = findAll();
        for (Motorcycle motorcycle : motorcycleList) {
            if (motorcycle.getLicensePlate().equals(entity.getLicensePlate())) {
                motorcycleList.remove(motorcycle);
                break;
            }
        }
        writeFile(motorcycleList);
    }

    @Override
    public Motorcycle findByLicensePlate(String licensePlate) {
        List<Motorcycle> motorcycleList = findAll();
        for (Motorcycle motorcycle : motorcycleList) {
            if (motorcycle.getLicensePlate().equals(licensePlate)) {
                return motorcycle;
            }
        }
        return null;
    }
}
