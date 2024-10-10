package ss20.bai_tap.transportMangement.model;

public class Motorbike extends Vehicle {
    private double power;

    public Motorbike(String licensePlates, String manufacturer, int years, String owner, double power) {
        super(licensePlates, manufacturer, years, owner);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String displayInfo() {
        return "MotorBike{" + super.toString() + ", power=" + power + "}";
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                super.toString() +
                "power=" + power +
                '}';
    }
}
