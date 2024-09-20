package src.ss7_interface_abstract_class.thuc_hanh.phuong_tien_di_chuyen;

public class XeDap extends PhuongTienDiChuyen{

    public XeDap(HangSanXuat hangSanXuat) {
        super("xe Đạp", hangSanXuat );
    }

    @Override
    public double layVanToc() {
        return 30;
    }
}
