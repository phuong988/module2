package src.bai_thi_module_2.PhoneMenagement.repository;

import src.bai_thi_module_2.PhoneMenagement.model.HandbookPhone;
import src.bai_thi_module_2.PhoneMenagement.utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class HandBookPhoneRepository implements IPhoneRepository<HandbookPhone> {
    private final String FILE_HANDBOOKPHONE = "D:\\codegym\\module2\\src\\src\\bai_thi_module_2\\PhoneMenagement\\data\\handbookPhone.csv";


    @Override
    public void add(HandbookPhone entity) {
        List<HandbookPhone> phoneCellularList = getAllPhone();
        phoneCellularList.add(entity);

        writeFile(phoneCellularList);
    }

    @Override
    public void writeFile(List<HandbookPhone> list) {
        List<String> stringList = new ArrayList<>();
        for (HandbookPhone cellular : list) {
            stringList.add(cellular.csvHandbookPhone());
        }

        ReadWriteFile.writeFile(FILE_HANDBOOKPHONE, stringList, false);
    }

    @Override
    public List<HandbookPhone> getAllPhone() {
        List<String> stringList = ReadWriteFile.readFile(FILE_HANDBOOKPHONE);
        List<HandbookPhone> phoneCellularList = new ArrayList<>();
        for (String cellular : stringList) {
            String[] split = cellular.split(",");
            String id = split[0];
            String tenDienThoai = split[1];
            double giaBan = Double.parseDouble(split[2]);
            int soLuong = Integer.parseInt(split[3]);
            String nhaSanXuat = split[4];
            String quocGiaXachTay = split[5];
            String trangThai = split[6];

            HandbookPhone phoneCellular = new HandbookPhone(id,tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
            phoneCellularList.add(phoneCellular);
        }
        return phoneCellularList;
    }

    @Override
    public void delete(HandbookPhone entity) {
        List<HandbookPhone> phoneCellularList = getAllPhone();
        for (HandbookPhone phoneCellular : phoneCellularList) {
            if (phoneCellular.getId().equals(entity.getId())) {
                phoneCellularList.remove(phoneCellular);
                break;
            }
        }
        writeFile(phoneCellularList);
    }

    @Override
    public HandbookPhone findById(String id) {
        List<HandbookPhone> phoneCellularList = getAllPhone();
        for (HandbookPhone phoneCellular : phoneCellularList) {
            if (phoneCellular.getId().equals(id)) {
                return phoneCellular;
            }
        }
        return null;
    }

    @Override
    public List<HandbookPhone> findByName(String name) {
        List<HandbookPhone> phoneCellularList = getAllPhone();
        List<HandbookPhone> result = new ArrayList<>();
        for (HandbookPhone phoneCellular : phoneCellularList) {
            if (phoneCellular.getTenDienThoai().toLowerCase().contains(name.toLowerCase())) {
                result.add(phoneCellular);
            }
        }
        return result;
    }
}