package src.ss12_map_tree.bai_tap.transport_management.service;

import src.ss12_map_tree.bai_tap.transport_management.model.Truck;

import java.util.List;

public interface ITruckService {
    void addTruck(Truck truck);
    List<Truck> getAllTrucks();
    void displayTrucks();
    Truck getTruckByLicensePlate(String licensePlate);
    void deleteTruck(String licensePlate);
}
