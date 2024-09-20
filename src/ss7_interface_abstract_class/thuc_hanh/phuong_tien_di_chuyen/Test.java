package src.ss7_interface_abstract_class.thuc_hanh.phuong_tien_di_chuyen;

public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hãng 1", "Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Hãng 2", "USA");
        HangSanXuat h3 = new HangSanXuat("Hãng 3", "Nhật Bản");

        PhuongTienDiChuyen p1 = new XeOto( h1,"Xăng");
        MayBay p2 = new MayBay("boeing777", h2);
        PhuongTienDiChuyen p3 = new XeDap(h3);
        System.out.println("Lấy hãng sản xuất:");
        System.out.println("p1: "+ p1.layTenHangSanXuat());

        System.out.println(" Bắt đầu ");
        p2.batDau();

        System.out.println("Lấy vận tốc: ");
        System.out.println("p1: "+ p1.layVanToc());
        System.out.println("p2: "+ p2.layVanToc());
        System.out.println("p3: "+ p3.layVanToc());

        System.out.println("Cất cánh: ");
        p2.catCanh();
    }
}
