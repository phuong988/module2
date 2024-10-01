package src.ss17.bai_tap.ProductManagement.service;

import src.ss17.bai_tap.ProductManagement.model.Product;
import src.ss17.bai_tap.ProductManagement.repository.ProductRepository;
import java.util.List;


public class ProductService implements IService<Product> {
    private final ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void displayAll() {
        List<Product> products = getAll();
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void searchById(String productId) {
        List<Product> products = getAll();
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

    @Override
    public void deleteById(String productId) {
        List<Product> products = getAll();
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getProductId().equals(productId)) {
                products.remove(i);
                System.out.println("Product with ID " + productId + " has been deleted.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found.");
        }
        //cap nhap file sau khi xóa
        productRepository.saveAll(products);
    }
}
