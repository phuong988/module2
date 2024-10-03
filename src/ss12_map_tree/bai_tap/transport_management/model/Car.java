package src.ss12_map_tree.bai_tap.transport_management.model;

public class Car extends Vehicle{
    private int seatNumber;
    private String carType;



    public Car(int seatNumber, String carType, String licensePlates, String manufacturer, int years, String owner) {
        super(licensePlates, manufacturer, years, owner);
        this.seatNumber = seatNumber;
        this.carType = carType;

    }



    @Override
    public String displayInfo() {
        return "Car{" + super.toString() +
                ", seatNumber=" + seatNumber +
                ", carType='" + carType +
                '\'' + "}";
    }

}
