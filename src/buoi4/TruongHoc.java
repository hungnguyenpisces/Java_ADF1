package buoi4;

import java.util.Scanner;

public class TruongHoc {
    // bien
	// b1: tao bien instance/ fields: dac diem cua cac doi tuong Truong hoc ?-> private
	private String tenTruong;
	private String diaChi;
	private int namThanhLap;
	private String trucThuoc;
	private int heDaoTao;
    Scanner sc = new Scanner(System.in);
	
	// b2: tao ham khoi tao/ constructor
	public TruongHoc() {
		super();
	}
	public TruongHoc(String tenTruong, String diaChi, int namThanhLap, String trucThuoc, int heDaoTao) {
		super();
		this.tenTruong = tenTruong;
		this.diaChi = diaChi;
		this.namThanhLap = namThanhLap;
		this.trucThuoc = trucThuoc;
		this.heDaoTao = heDaoTao;
	}
	// b3: tao ham set/get
	public String getTenTruong() {
		return tenTruong.toLowerCase();
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong.toUpperCase();
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getNamThanhLap() {
		return namThanhLap;
	}
	public void setNamThanhLap(int namThanhLap) {
		this.namThanhLap = namThanhLap;
	}
	public String getTrucThuoc() {
		return trucThuoc;
	}
	public void setTrucThuoc(String trucThuoc) {
		this.trucThuoc = trucThuoc;
	}
	public int getHeDaoTao() {
		return heDaoTao;
	}
	public void setHeDaoTao(int heDaoTao) {
		this.heDaoTao = heDaoTao;
	}
	// b4: tao cac ham nghiep vu: public
	public void nhapTT() {
		System.out.println("Nhap thong tin truong hoc: ");
		System.out.println("Ten truong: ");
		this.tenTruong = sc.nextLine();
		// nhap cac thong tin cua doi tuong tu ban phim
		while (this.namThanhLap <= 0) {
			System.out.println("Nam thanh lap: ");
			this.namThanhLap = sc.nextInt();
		}
		
	}
	@Override
	public String toString() {
		return "TruongHoc [tenTruong=" + tenTruong + ", diaChi=" + diaChi + ", namThanhLap=" + namThanhLap
				+ ", trucThuoc=" + trucThuoc + ", heDaoTao=" + heDaoTao + "]";
	}
	
}
