package src.ss12_map_tree.bai_tap.product_management.service;

import src.ss12_map_tree.bai_tap.product_management.model.Product;
import src.ss12_map_tree.bai_tap.product_management.repository.IProductRepository;
import src.ss12_map_tree.bai_tap.product_management.repository.ProductRepository;

import java.util.Collections;
import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id);
    }

    @Override
    public void delete(Product product) {
        this.productRepository.delete(product);
    }

    @Override
    public void update(Product product) {
        this.productRepository.update(product);
    }
}
