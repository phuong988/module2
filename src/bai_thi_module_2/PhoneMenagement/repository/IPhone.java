package src.bai_thi_module_2.PhoneMenagement.repository;

import java.util.List;

public interface IPhone<T> {
    List<T> findAll();
    void addPhone();
    void deletePhone();
    List<T> showListPhone();
    void  findPhoneByID();

}
