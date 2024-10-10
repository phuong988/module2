package ss20.bai_tap.transportMangement.service;

import ss20.bai_tap.transportMangement.model.Motorcycle;
import ss20.bai_tap.transportMangement.repository.IVehicleRepository;
import ss20.bai_tap.transportMangement.repository.MotorcycleRepository;

import java.util.List;

public class MotorbikeService implements IVehicleService<Motorcycle> {
    private IVehicleRepository<Motorcycle> motorcycleRepository = new MotorcycleRepository();

    @Override
    public List<Motorcycle> findAll() {
        return motorcycleRepository.findAll();
    }

    @Override
    public void add(Motorcycle entity) {
        motorcycleRepository.add(entity);
    }

    @Override
    public void delete(Motorcycle entity) {
        motorcycleRepository.delete(entity);
    }

    @Override
    public Motorcycle findByLicensePlate(String licensePlate) {
        return motorcycleRepository.findByLicensePlate(licensePlate);
    }
}
