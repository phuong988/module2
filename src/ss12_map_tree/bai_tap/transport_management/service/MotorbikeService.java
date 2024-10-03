package src.ss12_map_tree.bai_tap.transport_management.service;

import src.ss12_map_tree.bai_tap.transport_management.model.Motorbike;
import src.ss12_map_tree.bai_tap.transport_management.repository.MotorbikeRepository;

import java.util.List;

public class MotorbikeService implements IMotorbikeService {
    private final MotorbikeRepository motorbikeRepository = new MotorbikeRepository();  // chuyển sang MotorcycleRepository để tương tác với file CSV;

    @Override
    public void addMotorbike(Motorbike motorbike) {
        motorbikeRepository.addMotorbike(motorbike);
    }

    @Override
    public List<Motorbike> getAllMotorbikes() {
        motorbikeRepository.readFromFile();
        return motorbikeRepository.getAllMotorbikes();
    }

    @Override
    public void displayMotorbikes() {
        List<Motorbike> motorbikes = motorbikeRepository.getAllMotorbikes();
        for (Motorbike motorbike : motorbikes) {
            System.out.println(motorbike);
        }
    }

    @Override
    public Motorbike getMotorbikeByLicensePlate(String licensePlate) {
        for (Motorbike motorbike : motorbikeRepository.getAllMotorbikes()) {
            if (motorbike.getLicensePlates().equals(licensePlate)) {
                return motorbike;
            }
        }
        return null;
    }

    @Override
    public void deleteMotorbike(String licensePlate) {
        List<Motorbike> motorbikes = motorbikeRepository.getAllMotorbikes();
        motorbikes.removeIf(motorbike -> motorbike.getLicensePlates().equals(licensePlate));
        motorbikeRepository.writeToFile();
    }
}
