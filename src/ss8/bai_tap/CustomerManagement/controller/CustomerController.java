package src.ss8.bai_tap.CustomerManagement.controller;

import src.ss8.bai_tap.CustomerManagement.model.Customer;
import src.ss8.bai_tap.CustomerManagement.view.CustomerView;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> customers = new ArrayList<>();
    private CustomerView view = new CustomerView();

    public void updateCustomer(int id, String name, String address, String phoneNumber) {
        for (Customer customer1 : customers) {
            if (customer1.getId() == id) {
                customer1.setName(name);
                customer1.setAddress(address);
                customer1.setPhoneNumber(phoneNumber);
            }
        }
    }

    public void deleteCustomer(int id) {
        customers.remove(id);
    }

    public void displayCustomer() {
        view.showCustomerDetails(customers);
    }

    public Customer getCustomerById(int id) {
        for (Customer customer1 : customers) {
            if (customer1.getId() == id) {
                return customer1;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
    }
}

