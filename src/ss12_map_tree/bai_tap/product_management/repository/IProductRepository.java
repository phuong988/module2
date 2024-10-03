package src.ss12_map_tree.bai_tap.product_management.repository;

import src.ss12_map_tree.bai_tap.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void delete(Product product);

    void update(Product product);
}
