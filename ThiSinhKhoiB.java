public class ThiSinhKhoiB extends ThiSinh {
    public static final String MON_THI = "Toan, Hoa, Sinh";

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi thi: B | Mon thi: " + MON_THI);
    }
}
