package src.ss12_map_tree.thuc_hanh.quan_ly_ds_sinh_vien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choose = 0;
        do {
            System.out.println("-------------MENU -------------");
            System.out.println(
                            "1. Them sinh vien vao sinh vien\n" +
                            "2. In danh sach sinh vien\n" +
                            "3. Kiem tra danh sach co rong hay khong. \n" +
                            "4. Lay ra so luong sinh vien trong danh sach. \n" +
                            "5. Lam rong danh sach sinh vien. \n" +
                            "6. Tiem kiem bang ma sinh vien. \n" +
                            "7. Xoa mot sinh vien ra khoi danh sasch dua tren ma sinh vien. \n" +
                            "8. Tim kiem theo ten sinh vien. \n" +
                            "9. Xap xep danh sach sinh vien co diem tu cao den thap. \n" +
                            "0. Thoat khoi chuong trinh.");
            choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.next();
                System.out.println("Nhap ho va ten sinh vien: ");
                String hoTenSinhVien = sc.next();
                System.out.println("Nhap nam sinh:");
                String namSinh = sc.next();
                System.out.println("nhap diem trung binh: ");
                String diemTrungBinh = sc.next();
                SinhVien sv = new SinhVien(maSinhVien, hoTenSinhVien, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);
            } else if (choose == 2) {

            } else if (choose == 3) {

            } else if (choose == 4) {

            } else if (choose == 5) {

            } else if (choose == 6) {

            } else if (choose == 7) {

            } else if (choose == 8) {

            } else if (choose == 9) {
            }
        } while (choose != 0);
    }
}
