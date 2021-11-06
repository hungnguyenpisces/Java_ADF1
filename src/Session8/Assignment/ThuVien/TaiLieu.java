package Session8.Assignment.ThuVien;

import java.util.Scanner;

public class TaiLieu {
    protected String tenTaiLieu, nhaXB;
    protected int soPhatHanh;
    Scanner sc = new Scanner(System.in);

    public TaiLieu() {
        super();
    }

    public TaiLieu(String tenTaiLieu, String nhaXB, int soPhatHanh) {
        super();
        this.tenTaiLieu = tenTaiLieu;
        this.nhaXB = nhaXB;
        this.soPhatHanh = soPhatHanh;
    }

    public String getTenTaiLieu() {
        return this.tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getNhaXB() {
        return this.nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getSoPhatHanh() {
        return this.soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public void inputTaiLieu() {
        System.out.print("\nTen tai lieu: ");
        this.tenTaiLieu = sc.nextLine();
        System.out.print("\nNha xuat ban: ");
        this.nhaXB = sc.nextLine();
        System.out.print("\nSo phat hanh: ");
        this.soPhatHanh = sc.nextInt();
    }

    @Override
    public String toString() {
        return "{" + " tenTaiLieu='" + getTenTaiLieu() + "'" + ", nhaXB='" + getNhaXB() + "'" + ", soPhatHanh='"
                + getSoPhatHanh() + "}";
    }

}
