package src.ss7_interface_abstract_class.thuc_hanh.phuong_tien_di_chuyen;

public class XeOto extends PhuongTienDiChuyen{
    private String tenNhienLieu;

    public XeOto(HangSanXuat hangSanXuat ,String tenNhienLieu) {
        super("xe Ô tô", hangSanXuat);
        this.tenNhienLieu = tenNhienLieu;
    }

    public String getTenNhienLieu() {
        return tenNhienLieu;
    }

    public void setTenNhienLieu(String tenNhienLieu) {
        this.tenNhienLieu = tenNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 45;
    }
}
