package src.ss12_map_tree.bai_tap.product_management.repository;

import src.ss12_map_tree.bai_tap.product_management.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "iphone 15", 5000 ));
        products.add(new Product(2, "Xiasomi Node 14", 3000));
        products.add(new Product(3, "Samsung Galaxy s4", 6000));
        products.add(new Product(4, "Oppo f11", 4000));
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void update(Product product) {

    }
}
