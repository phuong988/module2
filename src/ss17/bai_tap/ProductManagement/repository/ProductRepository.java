package src.ss17.bai_tap.ProductManagement.repository;

import src.ss17.bai_tap.ProductManagement.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static final String FILE_PATH = "products.txt";

    // Ghi danh sách sản phẩm ra file nhị phân
    public void writeProductsToFile(List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc danh sách sản phẩm từ file nhị phân
    public List<Product> readProductsFromFile() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
