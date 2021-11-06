package buoi5;

import java.util.Scanner;

public class BookShelfMain {

	public static void main(String[] args) {
		System.out.println("Chuong trinh quan ly ke sach");
		Scanner sc = new Scanner(System.in);
		String confirm = "";
		BookShelf shelfTruyenTranh = new BookShelf();
		do {
			// mo bai: in ra menu
			System.out.println("1. nhap thong tin ke sach");
			System.out.println("2. hien thi thong tin ke sach");
			System.out.println("3. them 1 quyen sach vao ke");
			System.out.println("4. them tap sach vao ke");
			System.out.println("5. tim sach tu ma sach");
			System.out.println("6. thoat");
			// than bai: nghiep vu
			System.out.println("Nhap lua chon (1-6)");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("1. nhap thong tin ke sach");
				shelfTruyenTranh.nhapBookShelf();
				break;
			case 2:
				System.out.println("2. hien thi thong tin ke sach");
				shelfTruyenTranh.xuatKeSach();
				break;
			case 3:
				System.out.println("3. them 1 quyen sach vao ke");
				Book newBook = new Book();
				newBook.nhapBook();
				if (shelfTruyenTranh.addBookToShelf(newBook)) {
					System.out.println("Them 1 quyen sach vao ke thanh cong.");
				} else {
					System.out.println("Them 1 quyen sach vao ke that bai.");
				}
				break;
			case 4:
				System.out.println("4. them tap sach vao ke");
				// goi ham static: tham chieu tu ten lop:
				BookShelfMain.MainCase4(shelfTruyenTranh);
				break;
			case 5:
				System.out.println("5. tim sach tu ma sach");
				MainCase5(shelfTruyenTranh);
				break;
			case 6:
				System.out.println("6. thoat");
				break;
			default:
				System.out.println("Case khong hop le.");
				break;
			}
			if (choose == 6) {
				break;
			}
			sc.nextLine();
			// ket bai: tiep tuc?
			System.out.println("Ban co muon tiep tuc hay khong? (n: stop)");
			confirm = sc.nextLine();
		} while (!"n".equalsIgnoreCase(confirm));
	}
	// pham vi lop/ class: static
	public static void MainCase4(BookShelf shelf) {
		// tao 1 mang book
		Scanner sc = new Scanner(System.in);
		int soluong = 0;
		do {
			System.out.println("Ban muon tao bao nhieu quyen sach?");
			soluong = sc.nextInt();
		}while(soluong <= 0);
		Book[] inputBooks = new Book[soluong];
		for(int i=0; i< soluong; i++) {
			Book book = new Book();
			book.nhapBook();
			inputBooks[i] = book;
		}
		// them mang book vao ke
		int slbookadded = shelf.addListBookToShelf(inputBooks);
		// thong bao
		System.out.println("Co "+ slbookadded + " da duoc them thanh cong vao ke.");
	}
	// pham vi instance/ object/ doi tuong
	public void test() {
		System.out.println("test");
	}
	public static void MainCase5(BookShelf shelf) {
		Scanner sc = new Scanner(System.in);
		// nhap ma sach can tim
		System.out.println("Nhap ma sach can tim: ");
		String maSach = sc.nextLine();
		// tim quyen sach trong ke theo ma sach
		Book result = shelf.findBookByCode(maSach);
		// thong bao
		if (result == null) {
			System.out.println(" Ma sach: "+ maSach + " khong tim thay trong ke.");
		} else {
			System.out.println(" Sach can tim: "+ result);
		}
	}

}
