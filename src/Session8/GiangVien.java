package Session8;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import Session7.People;

public abstract class GiangVien extends People {
    private String maGV, emailGV;
    public static final int LuongBH = 800, LuongCB = 1000, Luong1H = 100;
    Scanner sc = new Scanner(System.in);

    public GiangVien() {
        super();
    }

    public GiangVien(String fullName, String address, String phone, String email, Date birthDay, char gentle,
            String maGV, String emailGV) {
        super(fullName, address, phone, email, birthDay, gentle);
        this.maGV = maGV;
        this.emailGV = emailGV;
    }

    public String getMaGV() {
        return this.maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getEmailGV() {
        return this.emailGV;
    }

    public void setEmailGV(String emailGV) {
        this.emailGV = emailGV;
    }

    @Override
    public void inputInfo() throws ParseException {
        super.inputInfo();
        System.out.print("\nMa GV: ");
        this.maGV = sc.nextLine();
        System.out.print("\nEmail GV: ");
        this.emailGV = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " maGV='" + getMaGV() + "'" + ", emailGV='" + getEmailGV() + "'"
                + this.tinhLuong() + "}";
    }

    public abstract float tinhLuong();
}
