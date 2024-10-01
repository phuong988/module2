package src.ss8.thuc_hanh.CustomerManagement.controller;

import src.ss8.bai_tap.CustomerManagement.model.Customer;
import src.ss8.bai_tap.CustomerManagement.view.CustomerView;
import src.ss8.thuc_hanh.CustomerManagement.service.CustomerService;

public class CustomerController {
    private CustomerService customerService = new CustomerService();
    private CustomerView view = new CustomerView();

    // Thêm khách hàng
    public void addCustomer(Customer customer) {
//        customerService.addCustomer(customer);
    }

    // Cập nhật khách hàng
    public void updateCustomer(int id, String name, String address, String phone) {
        customerService.updateCustomer(id, name, address, phone);
    }

    // Xóa khách hàng
    public void deleteCustomer(int id) {
        customerService.deleteCustomer(id);
    }

    // Hiển thị danh sách khách hàng
    public void displayCustomer() {
//        view.showCustomerDetails(customerService.getCustomers());
    }

    // Lấy khách hàng theo id
//    public Customer getCustomerById(int id) {
//        return customerService.getCustomerById(id);
//    }
}


