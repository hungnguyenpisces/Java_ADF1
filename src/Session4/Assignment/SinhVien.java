package Session4.Assignment;

import java.util.Scanner;

public class SinhVien {
    private String tenSV;
    private int namSinh, diemToan, diemVan, diemAnh;
    Scanner sc = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(String tenSV, int namSinh, int diemToan, int diemVan, int diemAnh) {
        this.setTenSV(tenSV);
        this.setNamSinh(namSinh);
        this.setDiemToan(diemToan);
        this.setDiemVan(diemVan);
        this.setDiemAnh(diemAnh);
    }

    public int getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(int diemAnh) {
        this.diemAnh = diemAnh;
    }

    public int getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(int diemVan) {
        this.diemVan = diemVan;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void inputInfo() {
        System.out.println("-------Nhap thong tin SV-------");
        System.out.printf("Ten SV: ");
        this.tenSV = sc.nextLine();
        while (this.namSinh <= 0) {
            System.out.printf("Nam sinh: ");
            this.namSinh = sc.nextInt();
        }
        System.out.printf("Diem Toan: ");
        this.diemToan = sc.nextInt();
        System.out.printf("Diem Van: ");
        this.diemVan = sc.nextInt();
        System.out.printf("Diem Anh: ");
        this.diemAnh = sc.nextInt();
    }

    public float diemTB() {
        return (this.diemToan + this.diemVan + this.diemAnh) / (float) 3;
    }

    public String xepLoai() {
        float dtb = this.diemTB();
        String xl = "";
        if (dtb > 9) {
            xl = "Gioi";
        } else if (dtb >= 7) {
            xl = "Kha";
        } else if (dtb >= 5) {
            xl = "Trung Binh";
        } else if (dtb < 5) {
            xl = "Yeu";
        }
        return xl;
    }

    @Override
    public String toString() {
        return "\nThong tin SV:\nTen SV: " + tenSV + "\nNam sinh: " + namSinh + "\nDiem Toan: " + diemToan
                + "\nDiem Van: " + diemVan + "\nDiem Anh: " + diemAnh + "\nTrung binh: " + this.diemTB()
                + "\nXep loai: " + this.xepLoai() + "\n";
    }
}
