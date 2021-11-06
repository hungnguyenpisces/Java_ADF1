package buoi8;

import java.util.Comparator;

import buoi7.Nguoi;
// tao ra 1 kieu quy tac sap xep
public class SapGiamDanTheoTenNhanSu implements Comparator<Nguoi>{

	@Override
	public int compare(Nguoi o1, Nguoi o2) {
		if (o1 == null || o2 == null)
			return -1;
		
		return o2.getHoTen().compareTo(o1.getHoTen());
	}

}
