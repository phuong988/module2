package src.ss12_map_tree.bai_tap.transport_management.service;

import src.ss12_map_tree.bai_tap.transport_management.model.Motorbike;

import java.util.List;

public interface IMotorbikeService {
    void addMotorbike(Motorbike motorbike);
    List<Motorbike> getAllMotorbikes();
    void displayMotorbikes();
    Motorbike getMotorbikeByLicensePlate(String licensePlate);
    void deleteMotorbike(String licensePlate);
}
