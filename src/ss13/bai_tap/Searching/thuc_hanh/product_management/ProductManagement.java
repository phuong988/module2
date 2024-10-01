package src.ss13.bai_tap.Searching.thuc_hanh.product_management;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManagement {
     static List<Product> products = new LinkedList<>();
    {
        addProduct(new Product("SP01", "Xiaomi node 14", 3000));
        addProduct(new Product("SP02", "Iphone", 4000));
        addProduct(new Product("SP03", "Samsung Galaxy S23", 5000));
        addProduct(new Product("SP04", "Oppo A93", 3500));
    }

    static void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product SearchProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public void updateProduct(String id, String newName, int newPrice) {
        for(Product product : products) {
            if(product.getId().equals(id)) {
                product.setName(newName);
                product.setPrice(newPrice);
                break;
            }
        }
        System.out.println("Successfully updated product!");
    }

    public static void deleteProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
            }
        }
        System.out.println("successfully deleted product!");
    }

    public static void displayProductsList() {
        for (Product product : products) {
            System.out.println(product);
            System.out.println("----------------------");
        }
    }

    // tìm kếm theo tên
    public void displayProducts(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }
    //sắp xếp sản phẩm tăng dần
    public void sortProducts() {
        Collections.sort(products);
        System.out.println("listproducts after sorting:");
    }

}
