package src.ss12_map_tree.bai_tap.transport_management.model;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String licensePlates, String manufacturer, int years, String owner, double loadCapacity) {
        super(licensePlates, manufacturer, years, owner);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String displayInfo() {
        return "Truck: " + super.toString() + ", Load Capacity: " + loadCapacity;
    }
}
