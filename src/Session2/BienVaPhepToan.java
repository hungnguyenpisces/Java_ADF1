package Session2;

import java.util.Scanner;

public class BienVaPhepToan {
    // khai báo biển ngoài hàm & trong class là biến intance hoặc class
    public static void main(String[] args) {
        // khai báo biến trong hàm là biến local
        int count = 100;
        // gán giá trị cho biến
        count = 1000;
        // kieu du lien nguyen thuy
        byte age = 100;
        short sAge = 128;
        int iAge = 32300;
        long lAge = 10L;
        float fAge = 12.3f;
        double dAge = 12.5;
        char gioiTinh = 'M';
        boolean isMua = false;
        // kieu du lien tham chieu
        String tenSinhVien = "Nguyen Van Hung";

        // snipet sysout in ra ma hinh console
        System.out.println(tenSinhVien);
        System.out.println(count);
        System.out.println(age);
        System.out.println(sAge);
        System.out.println(iAge);
        System.out.println(lAge);
        System.out.println(fAge);
        System.out.println(dAge);
        System.out.println(gioiTinh);
        System.out.println(isMua);

        // gan bien hang so
        final double PI = Math.PI;
        System.out.println(PI);

        // luong input
        // System.in
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi sinh vien");
        iAge = sc.nextInt();
        System.out.println(iAge);
        sc.nextLine();
        System.out.println("nhap ten sv:");
        tenSinhVien = sc.nextLine();
        System.out.println("Ten sv:" + tenSinhVien + "tuoi: " + iAge + "\n");
        sc.close();
    }
}
