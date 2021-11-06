package buoi8;

import java.util.Date;
import java.util.Scanner;

public class GiangVienFullTime extends GiangVien{
	private float hsLuongCapBac;
	private float hsLuongBh;
	
	public GiangVienFullTime() {
		super();
	}
	public GiangVienFullTime(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email,
			String maGv, String emailGv, float hsLuongCapBac, float hsLuongBh) {
		super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email, maGv, emailGv);
		this.hsLuongCapBac = hsLuongCapBac;
		this.hsLuongBh = hsLuongBh;
	}
	public float getHsLuongCapBac() {
		return hsLuongCapBac;
	}
	public void setHsLuongCapBac(float hsLuongCapBac) {
		this.hsLuongCapBac = hsLuongCapBac;
	}
	public float getHsLuongBh() {
		return hsLuongBh;
	}
	public void setHsLuongBh(float hsLuongBh) {
		this.hsLuongBh = hsLuongBh;
	}
	@Override
	public void nhapTT() {
		// nhap thong tin cua gv
		super.nhapTT();
		// nhap thong tin rieng cua gvfulltime
		Scanner sc = new Scanner(System.in);
		System.out.println("He so luong bao hiem: ");
		this.hsLuongBh = sc.nextFloat();
		System.out.println("He so luong cap bac: ");
		this.hsLuongCapBac = sc.nextFloat();
	}
	@Override
	public String toString() {
		return "GVFulltime:[" +super.toString() + ", hsLuongBh: "+ this.hsLuongBh + "; hsLuongCB: "+ this.hsLuongCapBac+ "]";
	}
	@Override
	public float tinhLuong() {
		return this.hsLuongBh* GiangVien.LuongBH + this.hsLuongCapBac * GiangVien.LuongCB;
	}
}
