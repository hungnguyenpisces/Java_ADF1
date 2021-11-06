package buoi5;

import java.util.Scanner;

// ke sach / chong sach
public class BookShelf {
	// fields
	private String maKe;
	private int viTri;
	private Book[] dsBook;
	// vi tri trong tiep theo de xep sach vao ke
	private int index;
	//methods
	public BookShelf() {
		this.dsBook = new Book[50];
		index = 0;
	}
	public String getMaKe() {
		return maKe;
	}
	public void setMaKe(String maKe) {
		this.maKe = maKe;
	}
	public int getViTri() {
		return viTri;
	}
	public void setViTri(int viTri) {
		this.viTri = viTri;
	}
	public Book[] getDsBook() {
		return dsBook;
	}
	public void setDsBook(Book[] dsBook) {
		this.dsBook = dsBook;
	}
	public void showDsbook() {
		for(Book b : this.dsBook) {
			if (b != null) {
				System.out.println(b.toString());
			}
		}
	}
	// nhap make, vitri, hoi muon nhap sach
	public void nhapBookShelf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ke sach: ");
		System.out.println("Ma ke: ");
		this.maKe = sc.nextLine();
		do {
			System.out.println("Vi tri ke (>0): ");
			this.viTri = sc.nextInt();
		}while(this.viTri <= 0);
		sc.nextLine();
		String confirm = "";
		while(true) {
			System.out.println("Ban co muon tao 1 quyen sach va xep vao ke hay khong?");
			confirm = sc.nextLine();
			// thoat lap:
			if ("n".equalsIgnoreCase(confirm)) {
				break;
			}
			if (this.index == this.dsBook.length) {
				System.out.println("Ke sach khong con cho trong.");
				break;
			}
			// tao 1 quyen sach moi
			Book book = new Book();
			book.nhapBook();
			// xep vao ke
			this.dsBook[this.index++] = book;
		}
	}
	// da co 1 quyen sach, them vao ke
	public boolean addBookToShelf(Book book) {
		if (book == null) {
			return false;
		}
		if (this.index == this.dsBook.length) {
			return false;
		}
		this.dsBook[this.index] = book;
		this.index++;
		return true;
	}
	// da co 1 chong sach, xep chong sach vao ke
	public int addListBookToShelf(Book[] listBook) {
		if (listBook == null)
			return -1;
		if (this.index == this.dsBook.length) {
			return 0;
		}
		int i = 0;
		for(Book book : listBook) {
			if (this.index < this.dsBook.length) {
				this.dsBook[this.index++] = book;
				i++;
			}
		}
		return i;
	}
	@Override
	public String toString() {
		return "Ke sach ma ke:" + this.maKe + "; vi tri: "+ this.viTri + "; sl sach dang co: "+ (this.index);
	}
	public void xuatKeSach() {
		// in thong tin ke sach
		System.out.println(this);
		// in ra thong tin cac quyen sach dang co trong ke
		this.showDsbook();
	}
	// tim sach theo ma sach: Quyen sach neu tim thay
	public Book findBookByCode(String maSach) {
		if (maSach == null || maSach.length() == 0) {
			return null;
		}
		for(int i=0; i< this.index; i++) {
			if (maSach.equalsIgnoreCase(this.dsBook[i].getCode())) {
				return this.dsBook[i];
			}
		}
		return null;
	}
}
