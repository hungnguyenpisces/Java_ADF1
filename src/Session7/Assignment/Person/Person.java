package Session7.Assignment.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    protected String hoTen, gioiTinh = "", diaChi;
    protected Date ngaySinh;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public Person() {
        super();
    }

    public Person(String hoTen, String gioiTinh, String diaChi, Date ngaySinh) {
        super();
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return this.gioiTinh.equalsIgnoreCase("m") ? "Nam" : this.gioiTinh.equalsIgnoreCase("f") ? "Nu" : "Khac";
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh == null ? "" : gioiTinh.toUpperCase();
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void inputPerson() {
        System.out.print("\nHo ten: ");
        this.hoTen = sc.nextLine();
        do {
            System.out.print("\nGioi tinh (M=Nam; F=Nu; O=Other): ");
            this.gioiTinh = sc.nextLine();
        } while (!"m".equalsIgnoreCase(this.gioiTinh) && !"f".equalsIgnoreCase(this.gioiTinh)
                && !"o".equalsIgnoreCase(this.gioiTinh));
        System.out.print("\nDia chi: ");
        this.diaChi = sc.nextLine();
        do {
            System.out.print("\nNgay sinh (dd/MM/yyy): ");
            try {
                this.ngaySinh = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } while (this.ngaySinh == null);
    }

    @Override
    public String toString() {
        return "{\n" + " hoTen='" + getHoTen() + "'" + ", gioiTinh='" + getGioiTinh() + "'" + ", diaChi='" + getDiaChi()
                + "'" + ", ngaySinh='" + (ngaySinh != null ? sdf.format(this.getNgaySinh()) : "") + "'" + "\n}";
    }

}
