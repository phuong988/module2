package ss20.bai_tap.transportMangement.controller;

import ss20.bai_tap.transportMangement.model.Motorcycle;
import ss20.bai_tap.transportMangement.service.IVehicleService;
import ss20.bai_tap.transportMangement.service.MotorcycleService;

import java.util.List;

public class MotorbikeController {
    private IVehicleService<Motorcycle> motorcycleService = new MotorcycleService();
    public List<Motorcycle> findAll() {
        return motorcycleService.findAll();
    }

    public void add(Motorcycle entity) {
        motorcycleService.add(entity);
    }

    public void delete(Motorcycle entity) {
        motorcycleService.delete(entity);
    }

    public Motorcycle findByLicensePlate(String licensePlate) {
        return motorcycleService.findByLicensePlate(licensePlate);
    }
}
