package buoi8;
import java.util.Date;
import java.util.Scanner;

import buoi7.Nguoi;
//class abstract: fields + hàm ( có định nghĩa ) + hàm ( abstract: không có định nghĩa/ không có thân hàm)
// Không tạo được đối tượng từ class abstract: không dùng new
public abstract class GiangVien extends Nguoi{
	private String maGv;
	private String emailGv;
	public static final int LuongBH = 800000;
	public static final int LuongCB = 1000000;
	public static final int Luong1Gio = 100000;
	public GiangVien() {
		super();
	}
	public GiangVien(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email,
			String maGv, String emailGv) {
		super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, emailGv);
		this.maGv = maGv;
		this.emailGv = emailGv;
	}
	public String getMaGv() {
		return maGv;
	}
	public void setMaGv(String maGv) {
		this.maGv = maGv;
	}
	public String getEmailGv() {
		return emailGv;
	}
	public void setEmailGv(String emailGv) {
		this.emailGv = emailGv;
	}
	@Override
	public void nhapTT() {
		// nhap thong tin ve nguoi cua Gv
		super.nhapTT();
		// nhap tt cua rieng Gv
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma Gv: ");
		this.maGv = sc.nextLine();
		System.out.println("Email Gv: ");
		this.emailGv = sc.nextLine();
	}
	@Override
	public String toString() {
		return super.toString() + "; Magv: "+ this.maGv + "; emailgv: "+ this.emailGv + "; luong: "+ this.tinhLuong() ;  
	}
	// tao 1 quy định/ ràng buộc -> abstract
	// hàm chỉ có khai báo không có định nghĩa/ thân hàm
	public abstract float tinhLuong();
}
