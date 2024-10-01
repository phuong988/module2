package src.ss8.thuc_hanh.CustomerManagement.repository;

import src.ss8.bai_tap.CustomerManagement.model.Customer;

public class CustomerRepository {
    public static Customer[] customers = new Customer[10];

    static {
        customers[0] = new Customer(01, "Thông soái ca", "Hà Nội", "090508235");
        customers[1] = new Customer(02, "Bùi Văn Lưu", "Huế", "0989989999" );
        customers[2] = new Customer(03, "Nguyễn Quang Mạnh Hưng", "Đại Lộc", "0905223322");
        customers[3] = new Customer(04, "Dặng Hữu Hải Minh", "Điện Bàn","0999599699");


    }
    public static Customer[] getAll() {
        return customers;
    }
    public void add(Customer customer) {
        for(int i = 0; i < customers.length; i++) {
            if(customers[i] == null) {
                customers[i] = customer;
                break;
            }
        }
    }
}