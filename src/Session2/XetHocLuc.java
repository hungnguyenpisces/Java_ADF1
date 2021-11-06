package Session2;

import java.util.Scanner;

/*
Nhap 1 so float tu ban phim la diem cua 1 hoc sinh
 Xet diem cua hs de xep loai hoc luc hoc sinh do:
 - Neu diem >= 9: xuat sac
 - diem < 9 va diem > 7: Kha
 - diem < 7 va diem >= 4: trung binh
 - con lai: yeu
*/
public class XetHocLuc {
    public static void main(String[] args) {
        System.out.println("Nhap diem hs");
        Scanner sc = new Scanner(System.in);
        float diem = sc.nextFloat();
        if (diem < 0 || diem > 10) {
            System.out.println("Diem vua nhap ngoai pham vi");
        } else if (diem >= 9) {
            System.out.printf("%f: Hs xuat sac", diem);
        } else if (diem >= 7) {
            System.out.printf("%f: HS kha", diem);
        } else if (diem >= 4) {
            System.out.printf("%f: Hs trung binh", diem);
        } else {
            System.out.printf("%f: HS yeu", diem);
        }
        sc.close();
    }
}
