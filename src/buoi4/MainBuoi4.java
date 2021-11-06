package buoi4;

public class MainBuoi4 {

	public static void main(String[] args) {
		LopHoc t2102e = new LopHoc("T2102E");
		t2102e.xuat();
		//t2102e.tenLop = "T2102E"; // tenLop: private
		t2102e.namHoc = 2020;
		t2102e.soluongHv = 15;
		t2102e.phongHoc = "C1";
		t2102e.setTenLop("T2112E");
		t2102e.xuat();
		System.out.println("Ten lop moi: "+ t2102e.getTenLop());
	}

}
