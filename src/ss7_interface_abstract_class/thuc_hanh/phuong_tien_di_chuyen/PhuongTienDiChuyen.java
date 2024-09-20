package src.ss7_interface_abstract_class.thuc_hanh.phuong_tien_di_chuyen;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;
    public PhuongTienDiChuyen() {}

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public void batDau() {
        System.out.println("bắt đầu ...");
    }

    public void tangToc() {
        System.out.println("Tăng tốc ...");
    }
    public void dungLai() {
        System.out.println("dừng lại ...");
    }
    public abstract double layVanToc();
}
