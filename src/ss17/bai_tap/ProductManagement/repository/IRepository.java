package src.ss17.bai_tap.ProductManagement.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();
    void saveAll(List<T> items);
    void add(T item);
    void delete(T item);

}
