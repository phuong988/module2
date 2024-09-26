package src.ss13.thuc_hanh.product_management;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("menu quản lý sản phẩm");
            System.out.println("1.thêm sản phẩm mới");
            System.out.println("2.hiển thị danh sách sản phẩm ");
            System.out.println("3.xóa sản phẩm ");
            System.out.println("4.sửa thông tin sản phẩm ");
            System.out.println("5.tìm sản phẩm theo tên ");
            System.out.println("6.sắp xếp sản phẩm theo thứ tự  ");
            System.out.println("7.thoát");
            System.out.print("chọn chức năng:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addProduct(sc, productManagement);
                    break;
                case 2:
                    productManagement.displayProductsList();
                    break;
                case 3:
                    deleteProduct(sc, productManagement);
                    break;
                case 4:
                    updateProduct(sc, productManagement);
                    break;
                case 5:
                    findProduct(sc, productManagement);
                    break;
                case 6:
                    productManagement.sortProducts();
                    productManagement.displayProductsList();
                    break;
                case 7:
                    System.exit(0);

            }
        }

    }

    private static void findProduct(Scanner sc, ProductManagement productManagement) {
        System.out.println("nhập tên cần tìm");
        String findName = sc.nextLine();
        productManagement.displayProducts(findName);
    }

    private static void updateProduct(Scanner sc, ProductManagement productManagement) {
        System.out.println("nhập id muốn sửa");
        String updateId = sc.nextLine();
        System.out.println("nhập tên mới");
        String newName = sc.nextLine();
        System.out.println("nhập giá mới");
        int newPrice = Integer.parseInt(sc.nextLine());
        productManagement.updateProduct(updateId, newName, newPrice);
    }

    private static void deleteProduct(Scanner sc, ProductManagement productManagementr) {
        ProductManagement.displayProductsList();
        System.out.println("nhập id muốn xóa");
        String deleteId = sc.nextLine();
        System.out.println("bạn có chắc chắn muốn xóa");
        System.out.println("1.có");
        System.out.println("2.không");
        int choice2 = Integer.parseInt(sc.nextLine());
        switch (choice2) {
            case 1:
                ProductManagement.deleteProductById(deleteId);
                break;
            case 2:
                break;
            default:
                System.out.println("vui lòng nhập đúng yêu cầu");
        }
    }

    private static void addProduct(Scanner sc, ProductManagement productManagement) {
        System.out.println("nhập id");
        String id = sc.nextLine();
        System.out.println("nhập tên");
        String name = sc.nextLine();
        System.out.println("nhập giá");
        int price = Integer.parseInt(sc.nextLine());
        ProductManagement.addProduct(new Product(id, name, price));
    }
}
