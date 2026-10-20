import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();

        while (true) {
            System.out.println("\n========== QUAN LY TUYEN SINH ==========");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat khoi chuong trinh");
            System.out.print("Chon chuc nang (1-4): ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chon khoi thi (A/B/C): ");
                    String khoi = scanner.nextLine().toUpperCase();
                    System.out.print("Nhap So bao danh: ");
                    String sbd = scanner.nextLine();
                    System.out.print("Nhap Ho ten: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhap Dia chi: ");
                    String diaChi = scanner.nextLine();
                    System.out.print("Nhap Muc uu tien: ");
                    int uuTien = Integer.parseInt(scanner.nextLine());

                    if (khoi.equals("A")) {
                        tuyenSinh.themMoiThiSinh(new ThiSinhKhoiA(sbd, hoTen, diaChi, uuTien));
                    } else if (khoi.equals("B")) {
                        tuyenSinh.themMoiThiSinh(new ThiSinhKhoiB(sbd, hoTen, diaChi, uuTien));
                    } else if (khoi.equals("C")) {
                        tuyenSinh.themMoiThiSinh(new ThiSinhKhoiC(sbd, hoTen, diaChi, uuTien));
                    } else {
                        System.out.println("Khoi thi khong hop le!");
                    }
                    break;
                case 2:
                    System.out.println("--- DANH SACH THI SINH ---");
                    tuyenSinh.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap SBD can tim: ");
                    String timSBD = scanner.nextLine();
                    ThiSinh ts = tuyenSinh.timKiemTheoSBD(timSBD);
                    if (ts != null) {
                        System.out.println("--- THONG TIN THI SINH TIM THAY ---");
                        ts.hienThiThongTin();
                    } else {
                        System.out.println("Khong tim thay thi sinh co SBD: " + timSBD);
                    }
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh. Tam biet!");
                    return;
                default:
                    System.out.println("Luoa chon khong hop le!");
            }
        }
    }
}
