package src.bai_thi_module_2.PhoneMenagement.model;

public class GenuinePhone extends Phone {

        private int thoiGianBaoHanh;
        private String phamViBaoHanh;

        public GenuinePhone() {}

        public GenuinePhone(int thoiGianBaoHanh, String phamViBaoHanh) {
            this.thoiGianBaoHanh = thoiGianBaoHanh;
            this.phamViBaoHanh = phamViBaoHanh;
        }

        public GenuinePhone(String id, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh) {
            super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
            this.thoiGianBaoHanh = thoiGianBaoHanh;
            this.phamViBaoHanh = phamViBaoHanh;
        }

        public int getThoiGianBaoHanh() {
            return thoiGianBaoHanh;
        }

        public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
            this.thoiGianBaoHanh = thoiGianBaoHanh;
        }

        public String getPhamViBaoHanh() {
            return phamViBaoHanh;
        }

        public void setPhamViBaoHanh(String phamViBaoHanh) {
            this.phamViBaoHanh = phamViBaoHanh;
        }

        @Override
        public String toString() {
            return "GenuinePhone{" +
                    "thoiGianBaoHanh=" + thoiGianBaoHanh +
                    ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                    '}';
        }

        public String csvGenuinePhone(){
            return super.csvPhone() + "," + this.thoiGianBaoHanh + "," + this.phamViBaoHanh;
        }
    }


