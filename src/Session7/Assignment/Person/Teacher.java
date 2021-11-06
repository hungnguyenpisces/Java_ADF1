package Session7.Assignment.Person;

import java.util.Date;

public class Teacher extends Person {
    private String boMon;
    private int luong_1h, h_thang;

    public Teacher(String hoTen, String gioiTinh, String diaChi, Date ngaySinh, String boMon, int luong_1h,
            int h_thang) {
        super(hoTen, gioiTinh, diaChi, ngaySinh);
        this.boMon = boMon;
        this.luong_1h = luong_1h;
        this.h_thang = h_thang;
    }

    public Teacher() {
    }

    public String getBoMon() {
        return this.boMon.toUpperCase();
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon.toUpperCase();
    }

    public int getLuong_1h() {
        return this.luong_1h;
    }

    public void setLuong_1h(int luong_1h) {
        this.luong_1h = luong_1h;
    }

    public int getH_thang() {
        return this.h_thang;
    }

    public void setH_thang(int h_thang) {
        this.h_thang = h_thang;
    }

    public void inputTeacher() {
        super.inputPerson();
        do {
            System.out.print("\nBo mon: ");
            this.boMon = sc.nextLine();
        } while (this.boMon == null);
        do {
            System.out.print("\nLuong 1h (k): ");
            this.luong_1h = sc.nextInt();
        } while (this.luong_1h <= 0);
        do {
            System.out.print("\nTong so gio day trong thang: ");
            this.h_thang = sc.nextInt();
        } while (this.h_thang <= 0);
    }

    public double tinhLuong() {
        switch (this.getBoMon().charAt(0)) {
        case 'T':
        case 'V':
        case 'A':
            return (double) (this.luong_1h + 50) * this.h_thang;
        case 'L':
        case 'H':
        case 'S':
            return (double) (this.luong_1h - 20) * this.h_thang;
        default:
            return (double) this.luong_1h * h_thang;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "{ Teacher: " + " boMon='" + getBoMon() + "'" + ", luong_1h='" + getLuong_1h() + "'"
                + ", h_thang='" + getH_thang() + "'" + ", Luong thuc nhan: '" + this.tinhLuong() + "k'\n}";
    }

}
