package src.ss12_map_tree.bai_tap.transport_management.controller;

import src.ss12_map_tree.bai_tap.transport_management.model.Truck;
import src.ss12_map_tree.bai_tap.transport_management.service.ITruckService;
import src.ss12_map_tree.bai_tap.transport_management.service.TruckService;

import java.util.List;

public class TruckController {
    private ITruckService truckService = new TruckService();

    public void addTruck(Truck truck) {
        truckService.addTruck(truck);
    }

    public void displayTrucks() {
        List<Truck> trucks = truckService.getAllTrucks();
        if (trucks.isEmpty()) {
            System.out.println("No trucks available.");
        } else {
            for (Truck truck : trucks) {
                System.out.println(truck.toString());
            }
        }
    }

    public Truck getTruckByLicensePlate(String licensePlate) {
        return truckService.getTruckByLicensePlate(licensePlate);
    }

    public void deleteTruck(String licensePlate) {
        truckService.deleteTruck(licensePlate);
    }

}
