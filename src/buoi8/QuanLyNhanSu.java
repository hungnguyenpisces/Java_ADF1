package buoi8;

import java.util.ArrayList;
import buoi7.Nguoi;
import buoi7.SinhVien;
public class QuanLyNhanSu {
	private ArrayList<Nguoi> dsNhanSu;

	public QuanLyNhanSu() {
		this.dsNhanSu = new ArrayList<Nguoi>();
	}

	public ArrayList<Nguoi> getDsNhanSu() {
		return dsNhanSu;
	}

	public void setDsNhanSu(ArrayList<Nguoi> dsNhanSu) {
		this.dsNhanSu = dsNhanSu;
	}
	public boolean themNhanSu(Nguoi nguoi) {
		if (nguoi != null) {
			return this.dsNhanSu.add(nguoi);
		}
		return false;
	}
	// tim ds Nguoi theo chua ten tu tham so:
	public ArrayList<Nguoi> timDsTheoTen(String name){
		// mo bai
		ArrayList<Nguoi> result = new ArrayList<Nguoi>();
		if (name == null)
			return result;
		// nghiep vu
		for(Nguoi ng : this.dsNhanSu) {
			if (ng.getHoTen().contains(name)) {
				result.add(ng);
			}
		}
		// ket luan
		return result;
	}
	// cap nhat thong tin cua 1 giang vien theo magv
	/*
	 * int result:
	 * =-1: tham so dau vao khong dung
	 * = 0: khong tim thay gv theo magv
	 * = 1: thanh cong
	 * = 2: that bai
	 * */
	public int updateGiangVien(String magv) {
		if (magv == null || magv.length() == 0)
			return -1;
		// xu ly nghiep vu
		// lay GiangVien theo magv
		int index = this.timGiangVienTuMa(magv);
		if (index == -1)
			return 0;
		GiangVien gv = (GiangVien) this.dsNhanSu.get(index);
		// nhap lai thong tin gv tim duoc
		System.out.println("Nhap lai thong tin cua GV: ");
		gv.nhapTT();
		// cap nhat doi tuong gv vao list
		if (this.dsNhanSu.set(index, gv) != null)
			return 1;
		return 2;
	}
	// tim giang vien theo magv: index cua phan tu
	public int timGiangVienTuMa(String magv) {
		if (magv == null || magv.length() == 0) return -1;
		GiangVien result = null;
		// xu ly nghiep vu
		for (int i=0; i< this.dsNhanSu.size(); i++) {
			Nguoi ng = this.dsNhanSu.get(i);
			// lay Nguoi la giang vien
			if (ng instanceof GiangVien) {
				GiangVien gv = (GiangVien) ng;
				if (magv.equals(gv.getMaGv())) {
					return i;
				}
			}
		}
		return -1;
	}
	// hien thi ds cac doi tuong theo loai: type = 0: tat ca, type =1: dssv, type = 2: dsgv
	public void showDsNhansu(int type){
		if (type == 1) {
			System.out.println("-----------Hien thi ds sinh vien: ");
			for(Nguoi ng : this.dsNhanSu) {
				if (ng instanceof SinhVien)
					System.out.println(ng.toString());
			}
		} else if (type == 2) {
			System.out.println("-----------Hien thi ds giang vien: ");
			for(Nguoi ng : this.dsNhanSu) {
				if (ng instanceof GiangVien)
					System.out.println(ng);
			}
		} else {
			System.out.println("-----------Hien thi ds nhan su: ");
			for(Nguoi ng : this.dsNhanSu) {
				System.out.println(ng);
			}
		}
	}
}
