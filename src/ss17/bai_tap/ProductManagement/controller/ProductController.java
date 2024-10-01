package src.ss17.bai_tap.ProductManagement.controller;

import src.ss17.bai_tap.ProductManagement.model.Product;
import src.ss17.bai_tap.ProductManagement.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private final ProductService productService = new ProductService();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n--- Product Manager ---");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Search product by ID");
            System.out.println("4. Delete product by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    productService.displayAll();
                    break;
                case 3:
                    searchProductById();
                    break;
                case 4:
                    deleteProductById();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

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
        productService.add(product);
        System.out.println("Product added successfully!");
    }

    private void searchProductById() {
        System.out.print("Enter product ID to search: ");
        String productId = scanner.nextLine();
        productService.searchById(productId);
    }
    private void deleteProductById() {
        System.out.print("Enter product ID to delete: ");
        String productId = scanner.nextLine();
        productService.deleteById(productId);
        System.out.println("Product deleted successfully!");
    }
}
