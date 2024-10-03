package src.ss12_map_tree.bai_tap.transport_management.model;

public abstract class Vehicle {
    public String licensePlates;
    public String manufacturer;
    public int years;
    public String owner;

    public Vehicle(String licensePlates, String manufacturer, int years, String owner) {
        this.licensePlates = licensePlates;
        this.manufacturer = manufacturer;
        this.years = years;
        this.owner = owner;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract String displayInfo();

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlates='" + licensePlates + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", years=" + years +
                ", owner='" + owner + '\'' +
                '}';
    }
}
