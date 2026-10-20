import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
    private List<ThiSinh> danhSachThiSinh;

    public TuyenSinh() {
        this.danhSachThiSinh = new ArrayList<>();
    }

    // Chức năng 1: Thêm mới thí sinh
    public void themMoiThiSinh(ThiSinh thiSinh) {
        danhSachThiSinh.add(thiSinh);
    }

    // Chức năng 2: Hiển thị thông tin thí sinh và khối thi
    public void hienThiDanhSach() {
        if (danhSachThiSinh.isEmpty()) {
            System.out.println("Danh sach thi sinh rong!");
            return;
        }
        for (ThiSinh ts : danhSachThiSinh) {
            ts.hienThiThongTin();
            System.out.println("-----------------------------------");
        }
    }

    // Chức năng 3: Tìm kiếm theo số báo danh
    public ThiSinh timKiemTheoSBD(String soBaoDanh) {
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(soBaoDanh)) {
                return ts;
            }
        }
        return null;
    }
}
