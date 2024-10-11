package src.bai_thi_module_2.PhoneMenagement.view;

import src.bai_thi_module_2.PhoneMenagement.model.GenuinePhone;
import src.bai_thi_module_2.PhoneMenagement.model.HandbookPhone;
import src.bai_thi_module_2.PhoneMenagement.repository.GenuinePhoneRepository;
import src.bai_thi_module_2.PhoneMenagement.repository.HandBookPhoneRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
        private static final Scanner scanner = new Scanner(System.in);
        private static final GenuinePhoneRepository genuinePhoneRepo = new GenuinePhoneRepository();
        private static final HandBookPhoneRepository handbookPhoneRepo = new HandBookPhoneRepository();

        public static void main(String[] args) {
            showMenu();
        }

        public static void showMenu() {
            while (true) {
                System.out.println("CHƯƠNG TRÌNH QUẢN LÍ ĐIỆN THOẠI \n" +
                        "Chọn chức năng: \n" +
                        "1. Thêm mới điện thoại chính hãng \n" +
                        "2. Thêm mới điện thoại sách tay \n" +
                        "3. Xoá điện thoại \n" +
                        "4. Xem danh sách điện thoại \n" +
                        "5. Tìm kiếm điện thoại \n" +
                        "6. Thoát");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        addGenuinePhone();
                        break;
                    case 2:
                        addHandbookPhone();
                        break;
                    case 3:
                        deletePhone();
                        break;
                    case 4:
                        showAllPhones();
                        break;
                    case 5:
                        searchPhone();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                }
            }
        }

        private static void addGenuinePhone() {
            System.out.println("Nhập ID: ");
            String id = scanner.nextLine();
            System.out.println("Nhập tên điện thoại: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá bán: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số lượng: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập nhà sản xuất: ");
            String manufacturer = scanner.nextLine();
            System.out.println("Nhập thời gian bảo hành: ");
            int warrantyPeriod = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập phạm vi bảo hành: ");
            String warrantyScope = scanner.nextLine();

            GenuinePhone genuinePhone = new GenuinePhone(id, name, price, quantity, manufacturer, warrantyPeriod, warrantyScope);
            genuinePhoneRepo.add(genuinePhone);
            System.out.println("Thêm điện thoại chính hãng thành công!");
        }

        private static void addHandbookPhone() {
            System.out.println("Nhập ID: ");
            String id = scanner.nextLine();
            System.out.println("Nhập tên điện thoại: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá bán: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số lượng: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập nhà sản xuất: ");
            String manufacturer = scanner.nextLine();
            System.out.println("Nhập quốc gia xách tay: ");
            String country = scanner.nextLine();
            System.out.println("Nhập trạng thái: ");
            String status = scanner.nextLine();

            HandbookPhone handbookPhone = new HandbookPhone(id, name, price, quantity, manufacturer, country, status);
            handbookPhoneRepo.add(handbookPhone);
            System.out.println("Thêm điện thoại sách tay thành công!");
        }

        private static void deletePhone() {
            System.out.println("Nhập ID điện thoại cần xóa: ");
            String id = scanner.nextLine();

            // Tìm và xóa điện thoại trong cả hai loại
            GenuinePhone genuinePhone = genuinePhoneRepo.findById(id);
            if (genuinePhone != null) {
                genuinePhoneRepo.delete(genuinePhone);
                System.out.println("Đã xóa điện thoại chính hãng có ID: " + id);
                return;
            }

            HandbookPhone handbookPhone = handbookPhoneRepo.findById(id);
            if (handbookPhone != null) {
                handbookPhoneRepo.delete(handbookPhone);
                System.out.println("Đã xóa điện thoại sách tay có ID: " + id);
                return;
            }

            System.out.println("Không tìm thấy điện thoại với ID: " + id);
        }

        private static void showAllPhones() {
            System.out.println("Danh sách điện thoại chính hãng:");
            List<GenuinePhone> genuinePhones = genuinePhoneRepo.getAllPhone();
            for (GenuinePhone phone : genuinePhones) {
                System.out.println(phone);
            }

            System.out.println("Danh sách điện thoại sách tay:");
            List<HandbookPhone> handbookPhones = handbookPhoneRepo.getAllPhone();
            for (HandbookPhone phone : handbookPhones) {
                System.out.println(phone);
            }
        }

        private static void searchPhone() {
            System.out.println("Nhập tên điện thoại cần tìm: ");
            String name = scanner.nextLine();

            List<GenuinePhone> foundGenuinePhones = genuinePhoneRepo.findByName(name);
            List<HandbookPhone> foundHandbookPhones = handbookPhoneRepo.findByName(name);

            System.out.println("Kết quả tìm kiếm:");
            for (GenuinePhone phone : foundGenuinePhones) {
                System.out.println(phone);
            }
            for (HandbookPhone phone : foundHandbookPhones) {
                System.out.println(phone);
            }
        }
    }

