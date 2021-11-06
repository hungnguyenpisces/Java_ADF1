package Session8;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class GiangVienFullTime extends GiangVien {
    private float hsLuongCapBac, hsLuongBh;
    Scanner sc = new Scanner(System.in);

    public GiangVienFullTime() {
        super();
    }

    public GiangVienFullTime(String fullName, String address, String phone, String email, Date birthDay, char gentle,
            String maGV, String emailGV, float hsLuongCapBac, float hsLuongBh) {
        super(fullName, address, phone, email, birthDay, gentle, maGV, emailGV);
        this.hsLuongCapBac = hsLuongCapBac;
        this.hsLuongBh = hsLuongBh;
    }

    public float getHsLuongCapBac() {
        return this.hsLuongCapBac;
    }

    public void setHsLuongCapBac(float hsLuongCapBac) {
        this.hsLuongCapBac = hsLuongCapBac;
    }

    public float getHsLuongBh() {
        return this.hsLuongBh;
    }

    public void setHsLuongBh(float hsLuongBh) {
        this.hsLuongBh = hsLuongBh;
    }

    @Override
    public void inputInfo() throws ParseException {
        super.inputInfo();
        System.out.print("\nHe so luong bao hiem: ");
        this.hsLuongBh = sc.nextFloat();
        System.out.print("\nHe so luong cap bac: ");
        this.hsLuongCapBac = sc.nextFloat();
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " hsLuongCapBac='" + getHsLuongCapBac() + "'" + ", hsLuongBh='" + getHsLuongBh()
                + "'" + "}";
    }

    @Override
    public float tinhLuong() {
        return this.hsLuongBh * LuongBH + this.hsLuongCapBac * LuongCB;
    }

}
