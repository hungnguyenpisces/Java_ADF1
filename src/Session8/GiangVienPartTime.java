package Session8;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class GiangVienPartTime extends GiangVien {
    private int sogio;
    Scanner sc = new Scanner(System.in);

    public GiangVienPartTime() {
        super();
    }

    public GiangVienPartTime(String fullName, String address, String phone, String email, Date birthDay, char gentle,
            String maGV, String emailGV, int sogio) {
        super(fullName, address, phone, email, birthDay, gentle, maGV, emailGV);
        this.sogio = sogio;
    }

    public int getSogio() {
        return this.sogio;
    }

    public void setSogio(int sogio) {
        this.sogio = sogio;
    }

    @Override
    public void inputInfo() throws ParseException {
        super.inputInfo();
        System.out.print("\nSo gio day:");
        this.sogio = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " sogio='" + getSogio() + "'" + "}";
    }

    @Override
    public float tinhLuong() {
        return this.sogio * Luong1H;
    }

}
