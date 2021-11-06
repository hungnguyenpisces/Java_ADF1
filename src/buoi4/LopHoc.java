package buoi4;

// 1 mẫu / template để sinh ra nhiều lớp học cụ thể 
public class LopHoc {
	// biến 
	// fields - biến instance: đặc điểm/ thuộc tính của các đối tượng -> khai báo
	// private: trong lop
	private String tenLop;
	// default: trong lop, cac class cùng package
	int namHoc;
	// protected: trong lop, cac class cùng package, cac lop con
	protected int soluongHv;
	// public: moi noi
	public String phongHoc;
	
	// method/ hàm
	// <pham vi truy cap> < kieu du lieu tra ve cua ham> <ten ham> (<danh sach tham so>){}
	// ham khởi tạo - constructor
	// <ten ham>: ten class
	// < kieu tra ve cua ham>: khong co kieu tra ve
	// muc dich: tao doi tuong + gan gia tri khoi tao cho cac fields;
	public LopHoc(String name) {
		tenLop = name;
	}
	private LopHoc() {
		
	}
	public LopHoc(String tenLop, int namHoc) {
		// gan gia tri khoi tao cho cac fields
		// this: dai dien cho doi tuong hien tai dang runtime
		this.tenLop = tenLop;
		this.namHoc = namHoc;
	}
	
	public LopHoc(String tenLop, int namHoc, int soluongHv, String phongHoc) {
		super();
		this.tenLop = tenLop;
		this.namHoc = namHoc;
		this.soluongHv = soluongHv;
		this.phongHoc = phongHoc;
	}
	// overloadding: nạp chồng: các hàm cùng 1 lớp có cùng tên hàm, nhưng khác nhau ds tham số (kiểu trả về)
	// ham tra ve doi tuong hien tai
	public LopHoc copy() {
		return this;
	}
	
	// get: tra ve gia tri cua thuoc tinh 
	public String getTenLop() {
		return this.tenLop;
	}
	// set: gan gia tri cho thuoc tinh
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	
	public int getNamHoc() {
		return namHoc;
	}
	public void setNamHoc(int namHoc) {
		this.namHoc = namHoc;
	}
	public int getSoluongHv() {
		return soluongHv;
	}
	public void setSoluongHv(int soluongHv) {
		this.soluongHv = soluongHv;
	}
	public String getPhongHoc() {
		return phongHoc;
	}
	public void setPhongHoc(String phongHoc) {
		this.phongHoc = phongHoc;
	}
	public void xuat() {
		/*
		System.out.println("Ten lop:" + this.tenLop
				 + "; nam hoc: "+ this.namHoc 
				 + "; slhv: "+ this.soluongHv
				 + "; phong hoc: "+ this.phongHoc);
				 */
		System.out.printf("Ten lop: %s; nam hoc: %d; slhv: %d; phong hoc: %s%n", 
				this.tenLop, this.namHoc, this.soluongHv, this.phongHoc);
	}
	public String getTT() {
		/*
		return "Ten lop:" + this.tenLop
				 + "; nam hoc: "+ this.namHoc 
				 + "; slhv: "+ this.soluongHv
				 + "; phong hoc: "+ this.phongHoc;
				 */
		String result = "";
		// nghiep vu
		result = String.format("Ten lop: %s; nam hoc: %d; slhv: %d; phong hoc: %s%n", 
				this.tenLop, this.namHoc, this.soluongHv, this.phongHoc);
		return result;
	}
	public static void main(String[] args) {
		// tao doi tuong:
		LopHoc t2104e; // t2104e: null: chua tham chieu, chua gan gt cu the
		// gan gia tri
		// toan new: toan tử khởi tạo -> tao doi tuong
		t2104e = new LopHoc(); // t2104e: khac null: tham chieu/ gán gtrij cụ thể các biến
		t2104e.xuat();
		t2104e.tenLop = "T2104";
		t2104e.namHoc = 2020;
		t2104e.soluongHv = 22;
		t2104e.phongHoc = "C10";
		t2104e.xuat();
		
		LopHoc t2103e = new LopHoc("T2103e", 2021);
		t2103e.xuat();
		t2103e.soluongHv = 16;
		t2103e.phongHoc = "C5";
		t2103e.xuat();
		
		LopHoc T2105e = t2104e.copy();
		System.out.println("t2104e: "+ t2104e);
		System.out.println("T2105e: "+ T2105e);
		T2105e = t2104e;
		System.out.println("T2105e: "+ T2105e);
	}
}
