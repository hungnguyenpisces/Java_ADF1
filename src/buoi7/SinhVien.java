package buoi7;

import java.util.Date;
import java.util.Scanner;

// class con - lop dan xuat: dinh nghia them đặc điểm hành vi mở rộng thêm từ class cha ( cha chưa định nghĩa)
public class SinhVien extends Nguoi {
	// fields: dac diem rieng cua SinhVien ma Nguoi chua co
	private String maSv;
	private String maLop;
	// methods: hanh vi rieng + mo rong hanh vi cua lop cha
	public SinhVien() {
		super();
	}
	public SinhVien(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email,
			String maSv, String maLop) {
		// ham super: goi toi ham constructor cua lop cha
		super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email);
		// super: tham chieu toi cac thanh phan (non - private ) cua lop cha
		this.maSv = maSv;
		this.maLop = maLop;
	}
	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public String getHoTen() {
		return "SV: "+ super.getHoTen();
	}
	public void setHoTen(String hoTen) {
		this.setHoTen( hoTen );
	}
	public void nhapSv() {
		// nhap thong tin cua Nguoi
		super.nhapTT();
		// nhap thong tin rieng cua Sv
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Masv: ");
		this.maSv = sc.nextLine();
		System.out.println("Nhap Ma lop: ");
		this.maLop = sc.nextLine();
	}
	@Override
	public String toString() {
		return "SinhVien ["+super.toString()+ ", maSv=" + maSv + ", maLop=" + maLop + "]";
	}
	// override: ghi đè: giữa 2 lớp cha và con, hàm/ method giữ nguyên khai báo, chỉ định nghĩa thân hàm
	@Override
	public void nhapTT() {
		// nhap thong tin cua Nguoi
		super.nhapTT();
		// nhap thong tin rieng cua Sv
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Masv: ");
		this.maSv = sc.nextLine();
		System.out.println("Nhap Ma lop: ");
		this.maLop = sc.nextLine();
	}
	public void diHoc() {
		System.out.println("Hoc 3,5,7 bat dau luc 6h toi.");
	}
}
