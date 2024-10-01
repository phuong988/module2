package src.ss17.bai_tap.ProductManagement.controller;

import src.ss17.bai_tap.ProductManagement.model.Product;
import src.ss17.bai_tap.ProductManagement.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private final ProductService productService = new ProductService();
    private final Scanner scanner = new Scanner(System.in);

    // Hàm này hiển thị menu và nhận lựa chọn từ người dùng
    public void start() {
        while (true) {
            System.out.println("\n--- Product Manager ---");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Search product by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    productService.displayAllProducts();
                    break;
                case 3:
                    searchProductById();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Nhận dữ liệu từ người dùng để thêm sản phẩm
    private void addProduct() {
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        Product product = new Product(productId, name, price, manufacturer, description);
        productService.addProduct(product);
        System.out.println("Product added successfully!");
    }

    // Nhận mã sản phẩm từ người dùng để tìm kiếm
    private void searchProductById() {
        System.out.print("Enter product ID to search: ");
        String productId = scanner.nextLine();
        productService.searchProductById(productId);
    }
}
