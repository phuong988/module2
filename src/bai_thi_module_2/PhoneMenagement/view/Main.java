package src.bai_thi_module_2.PhoneMenagement.view;
import java.util.List;
import java.util.Scanner;
import src.bai_thi_module_2.PhoneMenagement.model.GenuinePhone;
import src.bai_thi_module_2.PhoneMenagement.model.HandbookPhone;
import src.bai_thi_module_2.PhoneMenagement.repository.GenuinePhoneRepository;
import src.bai_thi_module_2.PhoneMenagement.repository.HandBookPhoneRepository;


public class Main {
        private GenuinePhoneRepository genuinePhoneRepository = new GenuinePhoneRepository();
        private HandBookPhoneRepository handBookPhoneRepository = new HandBookPhoneRepository();
        private Scanner scanner = new Scanner(System.in);

        public void showMenu() {
            while (true) {
                System.out.println("      CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI   \n" +
                        "Chọn chức năng theo số (để tiếp tục): \n" +
                        "1. Thêm mới \n" +
                        "2. Xóa \n" +
                        "3. Xem danh sách điện thoại \n" +
                        "4. Tìm kiếm \n" +
                        "5. Thoát\n" +
                        "Chọn chức năng: ");

                try {
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("---------------------------Thêm điện thoại---------------------------");
                            addPhone();
                            break;
                        case 2:
                            System.out.println("---------------------------Xoá điện thoại---------------------------");
                            deletePhone();
                            break;
                        case 3:
                            System.out.println("---------------------------Hiển thị danh sách điện thoại---------------------------");
                            showListPhone();
                            break;
                        case 4:
                            System.out.println("---------------------------Tìm điện thoại---------------------------");
                            searchPhone();
                            break;
                        case 5:
                            System.exit(0);
                        default:
                            System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: bạn nhập không phải là số nguyên");
                }
            }
        }

        private void addPhone() {
            System.out.println("Chọn loại điện thoại cần thêm: \n" +
                    "1. Điện thoại chính hãng (GenuinePhone) \n" +
                    "2. Điện thoại xách tay (HandbookPhone)");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // Thêm điện thoại chính hãng
                    GenuinePhone genuinePhone = new GenuinePhone();
                    System.out.println("Nhập ID:");
                    genuinePhone.setId(scanner.nextLine());
                    System.out.println("Nhập tên điện thoại:");
                    genuinePhone.setTenDienThoai(scanner.nextLine());
                    System.out.println("Nhập giá bán:");
                    genuinePhone.setGiaBan(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Nhập số lượng:");
                    genuinePhone.setSoLuong(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập nhà sản xuất:");
                    genuinePhone.setNhaSanXuat(scanner.nextLine());
                    System.out.println("Nhập thời gian bảo hành:");
                    genuinePhone.setThoiGianBaoHanh(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập phạm vi bảo hành:");
                    genuinePhone.setPhamViBaoHanh(scanner.nextLine());
                    List<GenuinePhone> genuinePhones = genuinePhoneRepository.findAll();
                    genuinePhones.add(genuinePhone);
                    genuinePhoneRepository.writeFile(genuinePhones);
                    break;

                case 2:
                    // Thêm điện thoại xách tay
                    HandbookPhone handbookPhone = new HandbookPhone();
                    System.out.println("Nhập ID:");
                    handbookPhone.setId(scanner.nextLine());
                    System.out.println("Nhập tên điện thoại:");
                    handbookPhone.setTenDienThoai(scanner.nextLine());
                    System.out.println("Nhập giá bán:");
                    handbookPhone.setGiaBan(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Nhập số lượng:");
                    handbookPhone.setSoLuong(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập nhà sản xuất:");
                    handbookPhone.setNhaSanXuat(scanner.nextLine());
                    System.out.println("Nhập quốc gia sách tay:");
                    handbookPhone.setQuocGiaSachTay(scanner.nextLine());
                    System.out.println("Nhập trạng thái:");
                    handbookPhone.setTrangThai(scanner.nextLine());
                    List<HandbookPhone> handbookPhones = handBookPhoneRepository.findAll();
                    handbookPhones.add(handbookPhone);
                    handBookPhoneRepository.writeFile(handbookPhones);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        private void deletePhone() {
            System.out.println("Chọn loại điện thoại cần xoá: \n" +
                    "1. Điện thoại chính hãng (GenuinePhone) \n" +
                    "2. Điện thoại xách tay (HandbookPhone)");
            int choose = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập ID điện thoại cần xoá:");
            String id = scanner.nextLine();
            switch (choose) {
                case 1:
                    GenuinePhone genuinePhone = genuinePhoneRepository.findPhoneByID(id);
                    if (genuinePhone != null) {
                        genuinePhoneRepository.deletePhone(genuinePhone);
                        System.out.println("Đã xoá điện thoại chính hãng thành công.");
                    } else {
                        System.out.println("Không tìm thấy điện thoại chính hãng với ID: " + id);
                    }
                    break;

                case 2:
                    HandbookPhone handbookPhone = handBookPhoneRepository.findPhoneByID(id);
                    if (handbookPhone != null) {
                        handBookPhoneRepository.deletePhone(handbookPhone);
                        System.out.println("Đã xoá điện thoại xách tay thành công.");
                    } else {
                        System.out.println("Không tìm thấy điện thoại xách tay với ID: " + id);
                    }
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        private void showListPhone() {
            System.out.println("Chọn loại điện thoại cần hiển thị: \n" +
                    "1. Điện thoại chính hãng (GenuinePhone) \n" +
                    "2. Điện thoại xách tay (HandbookPhone)");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    List<GenuinePhone> genuinePhoneList = genuinePhoneRepository.showListPhone();
                    for (GenuinePhone phone : genuinePhoneList) {
                        System.out.println(phone);
                    }
                    break;

                case 2:
                    List<HandbookPhone> handbookPhoneList = handBookPhoneRepository.showListPhone();
                    for (HandbookPhone phone : handbookPhoneList) {
                        System.out.println(phone);
                    }
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        private void searchPhone() {
            System.out.println("Nhập ID của điện thoại cần tìm:");
            String id = scanner.nextLine();
            GenuinePhone genuinePhone = genuinePhoneRepository.findPhoneByID(id);
            HandbookPhone handbookPhone = handBookPhoneRepository.findPhoneByID(id);
            if (genuinePhone == null && handbookPhone == null) {
                System.out.println("Không tìm thấy điện thoại với ID: " + id);
            } else {
                if (genuinePhone != null) {
                    System.out.println(genuinePhone);
                }
                if (handbookPhone != null) {
                    System.out.println(handbookPhone);
                }
            }
        }

        public static void main(String[] args) {
            Main main = new Main();
            main.showMenu();
        }
    }
}
