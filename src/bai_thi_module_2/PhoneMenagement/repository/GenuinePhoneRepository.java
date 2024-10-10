package src.bai_thi_module_2.PhoneMenagement.repository;

import src.bai_thi_module_2.PhoneMenagement.model.GenuinePhone;
import src.bai_thi_module_2.PhoneMenagement.utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class GenuinePhoneRepository implements IPhone {
    private final String FILE_GENUINEPHONE = "D:\\codegym\\module2\\src\\src\\bai_thi_module_2\\PhoneMenagement\\data\\genuinePhone.csv";

    // Phương thức để đọc danh sách điện thoại chính hãng từ file CSV
    public List<GenuinePhone> findAll() {
        List<String> stringList = ReadWriteFile.readFile(FILE_GENUINEPHONE);
        List<GenuinePhone> genuinePhoneList = new ArrayList<>();
        for (String line : stringList) {
            String[] arr = line.split(",");
            String id = arr[0];
            String tenDienThoai = arr[1];
            double giaBan = parseDouble(arr[2]);
            int soLuong = Integer.parseInt(arr[3]);
            String nhaSanXuat = arr[4];
            int thoiGianBaoHanh = Integer.parseInt(arr[5]);
            String phamViBaoHanh = arr[6];

            GenuinePhone genuinePhone = new GenuinePhone(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
            genuinePhoneList.add(genuinePhone); // Sửa lỗi: thiếu dòng thêm đối tượng vào danh sách
        }
        return genuinePhoneList;
    }

    // Phương thức để ghi danh sách điện thoại vào file CSV
    public void writeFile(List<GenuinePhone> list) {
        List<String> stringList = new ArrayList<>();
        for (GenuinePhone genuinePhone : list) {
            stringList.add(genuinePhone.csvGenuinePhone()); // Sửa lỗi: gọi đúng phương thức từ đối tượng GenuinePhone
        }
        ReadWriteFile.writeFile(FILE_GENUINEPHONE, stringList, false);
    }

    // Xóa điện thoại theo ID
    @Override
    public void deletePhone(GenuinePhone phoneToDelete) {
        List<GenuinePhone> genuinePhoneList = findAll();
        for (GenuinePhone genuinePhone : genuinePhoneList) {
            if (genuinePhone.getId().equals(phoneToDelete.getId())) { // Sửa lỗi: so sánh đối tượng đúng
                genuinePhoneList.remove(genuinePhone);
                break;
            }
        }
        writeFile(genuinePhoneList); // Cập nhật lại file sau khi xóa
    }

    // Hiển thị danh sách điện thoại
    @Override
    public List<GenuinePhone> showListPhone() {
        return findAll(); // Trả về danh sách đã đọc từ file
    }

    // Tìm kiếm điện thoại theo ID
    @Override
    public GenuinePhone findPhoneByID(String id) {
        List<GenuinePhone> genuinePhones = findAll();
        for (GenuinePhone genuinePhone : genuinePhones) {
            if (genuinePhone.getId().equals(id)) { // So sánh đúng ID
                return genuinePhone;
            }
        }
        return null; // Không tìm thấy điện thoại có ID tương ứng
    }
}