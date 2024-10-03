package src.ss12_map_tree.thuc_hanh.quan_ly_ds_sinh_vien;

public class SinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private String namSinh;
    private String diemTrungBinh;

    public SinhVien(String maSinhVien, String hoVaTen, String namSinh, String diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(String diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}
