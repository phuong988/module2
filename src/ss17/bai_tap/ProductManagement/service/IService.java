package src.ss17.bai_tap.ProductManagement.service;

import java.util.List;

public interface IService<T> {
    List<T> getAll();
    void add(T item);
    void displayAll();
    void searchById(String id);
    void deleteById(String id);
}
