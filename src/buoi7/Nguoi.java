package buoi7;
// 1. tao class cha: dac diem va hanh vi chung cua cac class con

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// fields
	private String hoTen;
	protected Date ngaySinh;
	protected char gioiTinh;
	protected String diaChi;
	protected String sdt;
	protected String email;
	final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	//method
	// constructor
	// overloadding: nạp chồng: trong cùng 1 lớp có 2 hoặc nhiều hàm có cùng tên hàm 
	// nhưng khác nhau ds tham số ( số lương, kiểu dữ liệu ) (kiểu trả về)
	public Nguoi() {
		super();
	}
	public Nguoi(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
	}
	// get/set
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void nhapTT(Scanner sc) {
		
	}
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho ten: ");
		this.hoTen = sc.nextLine();
		while (this.ngaySinh == null) {
			System.out.println("Ngay sinh (dd/MM/yyyy): ");
			try {
				this.ngaySinh = sdf.parse(sc.nextLine());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Gioi tinh: ");
		this.gioiTinh = (char) sc.nextByte();
		sc.nextLine();
		System.out.println("Dia chi: ");
		this.diaChi = sc.nextLine();
		System.out.println("Sdt: ");
		this.sdt = sc.nextLine();
		System.out.println("Email: ");
		this.email = sc.nextLine();
	}
	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", ngaySinh=" +(ngaySinh!=null?sdf.format(ngaySinh):"") + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi
				+ ", sdt=" + sdt + ", email=" + email+ "]";
	}
	
}
