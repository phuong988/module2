package src.bai_tap_lam_them.ManageElectricityBillList.service;

import src.bai_tap_lam_them.ManageElectricityBillList.model.Customer;
import java.util.List;

public interface CustomerRepository {
    void addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer findCustomerByName(String name);
    boolean customerExists(String customerId);
}
