package src.bai_thi_module_2.PhoneMenagement.repository;



import src.bai_thi_module_2.PhoneMenagement.model.GenuinePhone;
import src.bai_thi_module_2.PhoneMenagement.utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class GenuinePhoneRepository implements IPhoneRepository<GenuinePhone> {
    private final String FILE_GENUINEPHONE = "D:\\codegym\\module2\\src\\src\\bai_thi_module_2\\PhoneMenagement\\data\\genuinePhone.csv";


    @Override
    public void add(GenuinePhone entity) {
        List<GenuinePhone> phones = getAllPhone();
        phones.add(entity);

        writeFile(phones);
    }

    @Override
    public void writeFile(List<GenuinePhone> list) {
        List<String> lines = new ArrayList<>();
        for (GenuinePhone phone : list) {
            lines.add(phone.csvGenuinePhone());
        }
        ReadWriteFile.writeFile(FILE_GENUINEPHONE, lines, false);
    }

    @Override
    public List<GenuinePhone> getAllPhone() {
        List<String> stringList = ReadWriteFile.readFile(FILE_GENUINEPHONE);
        List<GenuinePhone> list = new ArrayList<>();
        for (String phone : stringList) {
            String[] split = phone.split(",");
            String id = split[0];
            String tenDienThoai = split[1];
            double giaBan = Double.parseDouble(split[2]);
            int soLuong = Integer.parseInt(split[3]);
            String nhaSanXuat = split[4];
            int warrantyPeriod = Integer.parseInt(split[5]);
            String warrantyScope = split[6];

            GenuinePhone phoneGenuine = new GenuinePhone(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, warrantyPeriod, warrantyScope);
            list.add(phoneGenuine);
        }
        return list;
    }

    @Override
    public void delete(GenuinePhone entity) {
        List<GenuinePhone> phones = getAllPhone();
        for (GenuinePhone phone : phones) {
            if (phone.getId() == entity.getId()) {
                phones.remove(phone);
                break;
            }
        }
        writeFile(phones);
    }

    @Override
    public GenuinePhone findById(String id) {
        List<GenuinePhone> phones = getAllPhone();
        for (GenuinePhone phone : phones) {
            if (phone.getId().equals(id)) {
                return phone;
            }
        }
        return null;
    }

    @Override
    public List<GenuinePhone> findByName(String name) {
        List<GenuinePhone> phones = getAllPhone();
        List<GenuinePhone> result = new ArrayList<>();

        for (GenuinePhone phone : phones) {
            if (phone.getTenDienThoai().toLowerCase().contains(name.toLowerCase())) {
                result.add(phone);
            }
        }
        return result;
    }

}
