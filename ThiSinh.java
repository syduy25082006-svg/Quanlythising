public class ThiSinh {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected int mucUuTien;

    public ThiSinh() {}

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void hienThiThongTin() {
        System.out.println("SBD: " + soBaoDanh + " | Ho ten: " + hoTen + " | Dia chi: " + diaChi + " | Uu tien: " + mucUuTien);
    }
}
