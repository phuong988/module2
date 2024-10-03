package src.ss12_map_tree.bai_tap.transport_management.service;

import src.ss12_map_tree.bai_tap.transport_management.model.Truck;
import src.ss12_map_tree.bai_tap.transport_management.repository.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {
private final TruckRepository truckRepository = new TruckRepository();

    @Override
    public void addTruck(Truck truck) {
        truckRepository.addTruck(truck);
    }

    @Override
    public List<Truck> getAllTrucks() {
        truckRepository.readFromFile();
        return truckRepository.getAllTrucks();
    }

    @Override
    public void displayTrucks() {
        List<Truck> trucks = truckRepository.getAllTrucks();
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    @Override
    public Truck getTruckByLicensePlate(String licensePlate) {
        for (Truck truck : truckRepository.getAllTrucks()) {
            if (truck.getLicensePlates().equals(licensePlate)) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public void deleteTruck(String licensePlate) {
        List<Truck> trucks = truckRepository.getAllTrucks();
        trucks.removeIf(truck -> truck.getLicensePlates().equals(licensePlate));
        truckRepository.writeToFile();
    }
}
