package src.ss17.bai_tap.ProductManagement.repository;

import src.ss17.bai_tap.ProductManagement.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IRepository<Product> {
    private static final String FILE_PATH = "products.txt";

    @Override
    public List<Product> getAll() {
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

    @Override
    public void saveAll(List<Product> products) {
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

    @Override
    public void add(Product product) {
        List<Product> products = getAll();
        products.add(product);
        saveAll(products);
    }

    @Override
    public void delete(Product product) {
        List<Product> products = getAll();
        products.remove(product);
        saveAll(products);
    }
}
