package buoi6;

import buoi5.Book;

public class Mang2ChieuDemo {

	public static void main(String[] args) {
		// toa chung cu co 10 tang, moi tang co 5 can ho
		String[][] toaAnBinh = new String[10][5];
		// gan gt cho tung can ho
		toaAnBinh[0][0] = "A11";
		// duyet:
		// duyet hang - duyet chieu thu nhat
		for(int i=0; i < toaAnBinh.length; i++) {
			String[] tang = toaAnBinh[i];
			// duyet cot - duyet chieu thu 2
			for(int j=0; j< tang.length; j++) {
				toaAnBinh[i][j] = "A"+(i+1) + (j+1);
			}
		}
		// foreach
		for(String[] tang : toaAnBinh) {
			for(String canHo : tang) {
				System.out.print(canHo + "   ");
			}
			System.out.println();
		}
		// doi tuong
		Book[][] nhaSachTriDuc = new Book[30][50];
	}

}
