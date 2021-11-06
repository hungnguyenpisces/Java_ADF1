package buoi9;

import java.util.Date;
import java.util.Scanner;

import buoi7.Nguoi;

public class NhanVien extends Nguoi implements IWorker, IContent{
	// biến:
	private String maNv;
	private String phongBan;
	private int type; // 1: le tan, 2: nv phong ban, 3: bao ve
	public NhanVien() {
		super();
	}
	public NhanVien(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email,
			String maNv, String phongBan) {
		super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email);
		this.maNv = maNv;
		this.phongBan = phongBan;
	}
	public String getMaNv() {
		return maNv;
	}
	public void setMaNv(String maNv) {
		this.maNv = maNv;
	}
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public void nhapTT() {
		super.nhapTT();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma nv: ");
		this.maNv = sc.nextLine();
		System.out.println("Phong ban: ");
		this.phongBan = sc.nextLine();
		do {
			System.out.println("Vi tri lam viec: ");
			this.type = sc.nextInt();
		}while(this.type != 1 && this.type != 2 && this.type != 3);
	}
	@Override
	public String toString() {
		return "Nhan vien: "+ super.toString() + "; manv: "+ this.maNv + "; phong ban: "+ this.phongBan
				+ "; vi tri: "+ (this.type==1?"Le tan": (this.type==2?"Nv phong ban":(this.type == 3?"Bao ve": "Khac")));
	}
	@Override
	public void doWork() {
		// ktra nv vi tri nao ->db -> lich cong tac
		// ghi nhan -> db
		if (this.type == 1) {
			System.out.println("Le tan dung lam viec 8h sang -> 17h chieu.");
		} else if (this.type == 2) {
			System.out.println("Nhan vien phai bat dau lam viec tu 8h sang -> 17h chieu.");
		} else if (this.type == 3) {
			System.out.println("Bao ve phai lam viec theo ca");
		} else {
			System.out.println("Khac");
		}
	}
	@Override
	public void dongPhuc() {
		// ktra nv vi tri nao -> db -> dong phuc
		switch (this.type) {
		case 1:
			if (this.gioiTinh == '1') {
				System.out.println("Le tan nam thi phai mac vest den");
			} else if (this.gioiTinh == '0') {
				System.out.println("Le tan nu thi phai mac ao dai.");
			} else {
				System.out.println("Khac");
			}
			break;
		case 2:
			System.out.println("Nhan vien phong ban thi mac lich su, tre trung, nang dong.");
			break;
		case 3:
			System.out.println("Bao ve phai mac do bao ho lao dong.");
			break;
		default:
			System.out.println("Khac");
			break;
		}
	}
}
