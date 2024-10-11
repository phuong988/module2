package src.bai_thi_module_2.PhoneMenagement.repository;

import src.bai_thi_module_2.PhoneMenagement.model.GenuinePhone;

import java.util.List;

public interface IPhoneRepository<T> {
    void add(T entity);

    void writeFile(List<T> list);

    List<T> getAllPhone();

    void delete(T entity);

    T findById(String id);

    List<T> findByName(String name);
}