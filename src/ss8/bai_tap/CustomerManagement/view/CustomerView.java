package src.ss8.bai_tap.CustomerManagement.view;

import src.ss8.bai_tap.CustomerManagement.model.Customer;

import java.util.List;

public class CustomerView {
    public void ShowCustomer(List<Customer> customers) {
        for(Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void showCustomerDetails(List<Customer> customers) {

    }
}
