package buoi5;

import java.util.Scanner;

// mang 1 chieu
public class Mang1ChieuDemo {

	public static void main(String[] args) {
		String m = null;
		//System.out.println(m.equals("a")); // null khong dc tham chieu
		// khai bao
		float point;
		float[] points; // null
		// khoi tao
		points = new float[10];
		System.out.println("Gia tri mac dinh cua phan tu dau tien: "+ points[0]);
		System.out.println("Kich thuoc cua mang: "+ points.length);
		// khoi tao bien mang + khoi tao cac gia tri cua phan tu mang
		String[] dsLopToi = {"T2104E", "T2103E", "T2102E", "T2101E"};
		// duyet mang:
		// for: index
		for(int i=0; i < dsLopToi.length; i++) {
			System.out.print(dsLopToi[i] + "  ");
		}
		System.out.println();
		// foreach
		for(String lop : dsLopToi) {
			System.out.print(lop + "  ");
		}
		System.out.println();
		// thao tac toi phan tu cua mang
		for(float tmp : points) {
			System.out.print(tmp + "  ");
		}
		System.out.println();
		System.out.println("Nhap danh sach cac diem: ");
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while (index < points.length) {
			// nghiep vu: nhap 1 diem, luu diem vao phan tu tiep theo cua mang
			System.out.println("Nhap diem: ");
			float pp = sc.nextFloat();
			points[index++] = pp;
			// b3: tang/ giam gia tri lap
			// dk thoat lap
			sc.nextLine();
			System.out.println("Ban co muon nhap phan tu tiep theo hay khong? (n: thoat)");
			String confirm = sc.nextLine();
			if ("n".equals(confirm)) {
				break;
			}
		}
		System.out.println("Hien thi ds mang sau khi nhap:");
		for(float tmp : points) {
			System.out.print(tmp + "  ");
		}
		System.out.println();
		System.out.println("Hien thi ds mang cac phan tu da nhap: ");
		for(int i=0; i< index; i++) {
			System.out.print(points[i] + "  ");
		}
		System.out.println();
		
		
		
	}

}
