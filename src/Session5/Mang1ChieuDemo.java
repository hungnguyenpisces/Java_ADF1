package Session5;

import java.util.Scanner;

public class Mang1ChieuDemo {
    public static void main(String[] args) {
        float[] points;
        points = new float[10];
        System.out.println("Gia tri mac dich cua phan tu mang " + points[0]);
        System.out.println("kich thuoc mang: " + points.length);

        String[] dsLopToi = { "T2104E", "T2103E", "T2102E", "T2101E" };
        // duyệt mảng với for index
        for (int i = 0; i < dsLopToi.length; i++) {
            System.out.print(dsLopToi[i] + "\t");
        }
        System.out.println();
        // duyệt mảng bằng forEach
        for (String lop : dsLopToi) {
            System.out.print(lop + "\t");
        }
        System.out.println();
        // thao tác phần tử
        System.out.println("Nhap danh sach cac diem: ");
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (index < points.length) {

            System.out.println("Nhap diem:");
            float pp = sc.nextFloat();
            points[index++] = pp;
            sc.nextLine();
            System.out.println("Ban co muon nhap phan tu tiep theo?(n = no)");
            String confirm = sc.nextLine();
            if ("n".equals(confirm)) {
                break;
            }
        }
        System.out.println("mang sau khi nhap");
        for (int i = 0; i < index; i++) {
            System.out.print(points[i] + "  ");
        }
        System.out.println();
        sc.close();
    }
}
