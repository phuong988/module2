package src.bai_tap_lam_them.ManageElectricityBillList.model;

public class VietnameseCustomer extends Customer  {
    private String customerType;
    private double consumptionLimit;

    public VietnameseCustomer(String customerCode, String fullName, String customerType, double consumptionLimit) {
        super(customerCode, fullName);
        this.customerType = customerType;
        this.consumptionLimit = consumptionLimit;
    }

    public String getTypeOfCustomer() {
        return customerType;
    }

    public void setTypeOfCustomer(String string) {
        this.customerType = string;
    }

    public double getConsumptionLimit() {
        return consumptionLimit;
    }

    public void setConsumptionLimit(double consumptionLimit) {
        this.consumptionLimit = consumptionLimit;
    }
    
    public double calculateTotal(double consumption, double unitPrice) {
        if (consumption > consumptionLimit) {
            return consumption * unitPrice;
        }else {
            return unitPrice *consumptionLimit + (consumptionLimit - consumption) * unitPrice * 2.5;
        }
    }
}
