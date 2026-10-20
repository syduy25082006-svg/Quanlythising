public class ThiSinhKhoiA extends ThiSinh {
    public static final String MON_THI = "Toan, Ly, Hoa";

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi thi: A | Mon thi: " + MON_THI);
    }
}
