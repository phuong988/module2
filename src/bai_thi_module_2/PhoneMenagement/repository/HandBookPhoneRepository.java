package src.bai_thi_module_2.PhoneMenagement.repository;

import src.bai_thi_module_2.PhoneMenagement.model.HandbookPhone;
import src.bai_thi_module_2.PhoneMenagement.utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class HandBookPhoneRepository {
    private final String FILE_HANKBOOKPHONE = "D:\\codegym\\module2\\src\\src\\bai_thi_module_2\\PhoneMenagement\\data\\handbookPhone.csv";

    public List<HandbookPhone> findAll() {
        List<String> stringList = ReadWriteFile.readFile(FILE_HANKBOOKPHONE);
        List<HandbookPhone> handbookPhoneList = new ArrayList<>();
        for (String line : stringList) {
            String[] arr = line.split(",");
            String id = arr[0];
            String tenDienThoai = arr[1];
            double giaBan = parseDouble(arr[2]);
            int soLuong = Integer.parseInt(arr[3]);
            String nhaSanXuat = arr[4];
            String quocGiaSachTay = arr[5];
            String trangThai = arr[6];

            HandbookPhone handbookPhone = new HandbookPhone(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaSachTay, trangThai);
            handbookPhoneList.add(handbookPhone);
        }
        return handbookPhoneList;
    }

    public void writeFile(List<HandbookPhone> list) {
        List<String> stringList = new ArrayList<>();
        for (HandbookPhone handbookPhone : list) {
            stringList.add(handbookPhone.csvHandbookPhone());
        }
        ReadWriteFile.writeFile(FILE_HANKBOOKPHONE, stringList, false);
    }

    public void deletePhone(HandbookPhone handbookPhone) {
        List<HandbookPhone> handbookPhoneList = findAll();
        handbookPhoneList.removeIf(existingPhone -> existingPhone.getId().equals(handbookPhone.getId()));
        writeFile(handbookPhoneList);
    }

    public List<HandbookPhone> showListPhone() {
        return findAll();
    }

    public HandbookPhone findPhoneByID(String id) {
        List<HandbookPhone> handbookPhones = findAll();
        for (HandbookPhone handbookPhone : handbookPhones) {
            if (handbookPhone.getId().equals(id)) {
                return handbookPhone;
            }
        }
        return null;
    }
}