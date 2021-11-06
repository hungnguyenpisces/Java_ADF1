package buoi8;

import java.util.Date;
import java.util.Scanner;

public class GiangVienPartTime extends GiangVien {
	private int sogio;
	
	public GiangVienPartTime() {
		super();
	}

	public GiangVienPartTime(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email,
			String maGv, String emailGv, int sogio) {
		super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email, maGv, emailGv);
		this.sogio = sogio;
	}
	
	public int getSogio() {
		return sogio;
	}

	public void setSogio(int sogio) {
		this.sogio = sogio;
	}

	@Override
	public void nhapTT() {
		super.nhapTT();
		// nhap thong tin rieng cua gvparttime
		Scanner sc = new Scanner(System.in);
		System.out.println("So gio day: ");
		this.sogio = sc.nextInt();
	}

	@Override
	public String toString() {
		return "GVParttime:[" +super.toString() + ", sogio: "+ this.sogio + "]";
	}

	@Override
	public float tinhLuong() {
		return this.sogio * GiangVien.Luong1Gio;
	}

}
