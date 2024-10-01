package src.ss8.thuc_hanh.CustomerManagement.service;

import src.ss8.thuc_hanh.CustomerManagement.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    // Thêm khách hàng
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Cập nhật khách hàng
    public void updateCustomer(int id, String name, String address, String phone) {
        for (Customer customer1 : customers) {
            if (customer1.getId() == id) {
                customer1.setName(name);
                customer1.setAddress(address);
                customer1.setPhoneNumber(phone);
                return;
            }
        }
    }

    // Xóa khách hàng
    public void deleteCustomer(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }

    // Lấy danh sách khách hàng
    public List<Customer> getCustomers() {
        return customers;
    }

    // Tìm kiếm khách hàng theo id
    public Customer getCustomerById(int id) {
        for (Customer customer1 : customers) {
            if (customer1.getId() == id) {
                return customer1;
            }
        }
        return null;
    }
}
