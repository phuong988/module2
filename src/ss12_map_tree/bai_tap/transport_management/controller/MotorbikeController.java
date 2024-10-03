package src.ss12_map_tree.bai_tap.transport_management.controller;

import src.ss12_map_tree.bai_tap.transport_management.model.Motorbike;
import src.ss12_map_tree.bai_tap.transport_management.service.IMotorbikeService;
import src.ss12_map_tree.bai_tap.transport_management.service.MotorbikeService;

import java.util.List;

public class MotorbikeController {
    private IMotorbikeService motorbikeService = new MotorbikeService();

    public void addMotorbike(Motorbike motorbike) {
        motorbikeService.addMotorbike(motorbike);
    }

    public void displayMotorbikes() {
        List<Motorbike> motorbikes = motorbikeService.getAllMotorbikes();
        if (motorbikes.isEmpty()) {
            System.out.println("No motorbikes available.");
        } else {
            for (Motorbike motorbike : motorbikes) {
                System.out.println(motorbike.toString());
            }
        }
    }

    public Motorbike getMotorbikeByLicensePlate(String licensePlate) {
        return motorbikeService.getMotorbikeByLicensePlate(licensePlate);
    }

    public void deleteMotorbike(String licensePlate) {
        motorbikeService.deleteMotorbike(licensePlate);
    }
}
