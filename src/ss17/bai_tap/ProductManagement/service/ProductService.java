package src.ss17.bai_tap.ProductManagement.service;

import src.ss17.bai_tap.ProductManagement.model.Product;
import src.ss17.bai_tap.ProductManagement.repository.ProductRepository;
import java.util.List;


public class ProductService {
    private final ProductRepository productRepository = new ProductRepository();

    // Lấy danh sách sản phẩm từ file
    public List<Product> getAllProducts() {
        return productRepository.readProductsFromFile();
    }

    // Thêm sản phẩm mới vào danh sách và ghi ra file
    public void addProduct(Product product) {
        List<Product> products = getAllProducts();
        products.add(product);
        productRepository.writeProductsToFile(products);
    }

    // Hiển thị tất cả các sản phẩm
    public void displayAllProducts() {
        List<Product> products = getAllProducts();
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Tìm kiếm sản phẩm theo mã
    public void searchProductById(String productId) {
        List<Product> products = getAllProducts();
        boolean found = false;
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                System.out.println(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }
}
