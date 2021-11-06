package Session7.Assignment.Person;

import java.util.Date;

public class Student extends Person {
    private String maSV, email;
    private double diemTB;

    public Student(String hoTen, String gioiTinh, String diaChi, Date ngaySinh, String maSV, String email,
            double diemTB) {
        super(hoTen, gioiTinh, diaChi, ngaySinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTB = diemTB;
    }

    public Student() {
    }

    public String getMaSV() {
        return this.maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTB() {
        return this.diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void inputStudent() {
        super.inputPerson();
        System.out.print("\nMa SV: ");
        this.maSV = sc.nextLine();
        System.out.print("\nEmail: ");
        this.email = sc.nextLine();
        do {
            System.out.print("\nDiem TB: ");
            this.diemTB = sc.nextDouble();
        } while (this.diemTB <= 0 || this.diemTB > 10);
    }

    public String xepLoai() {
        if (this.diemTB >= 9) {
            return "Gioi";
        } else if (this.diemTB >= 7) {
            return "Kha";
        } else if (this.diemTB >= 5) {
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "{Student: " + " maSV='" + getMaSV() + "'" + ", email='" + getEmail() + "'"
                + ", diemTB='" + getDiemTB() + "'" + ", Xep loai: '" + this.xepLoai() + "'\n}";
    }

}
