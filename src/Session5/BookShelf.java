package Session5;

import java.util.Scanner;

public class BookShelf {
    private String maKe;
    private int viTri;
    private Book[] bookList;
    private int index;
    Scanner sc = new Scanner(System.in);

    public BookShelf() {
        this.bookList = new Book[50];
        index = 0;
    }

    public BookShelf(String maKe, int viTri, Book[] bookList) {
        this.maKe = maKe;
        this.viTri = viTri;
        this.bookList = bookList;
    }

    public void setMaKe(String maKe) {
        this.maKe = maKe;
    }

    public String getMaKe() {
        return maKe;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }

    public int getViTri() {
        return viTri;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void showBookList() {
        for (Book book : this.bookList) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }

    public void inputBookShelf() {
        System.out.println("Nhap ke sach:");
        System.out.println("Ma ke: ");
        this.maKe = sc.nextLine();
        do {
            System.out.println("Vi tri ke(>0):");
            this.viTri = sc.nextInt();
        } while (this.viTri <= 0);
        sc.nextLine();
        String confirm = "";
        while (true) {
            System.out.println("Ban co muon nhap vao ke 1 quyen sach?");
            confirm = sc.nextLine();
            if ("n".equalsIgnoreCase(confirm)) {
                break;
            }
            if (this.index == bookList.length) {
                System.out.println("Ke sach da du 50 quyen");
                break;
            }
            Book book = new Book();
            book.inputBook();
            this.bookList[index++] = book;
        }
    }

    public boolean addBookToShelf(Book book) {
        if (book == null) {
            return false;
        }
        if (this.index == bookList.length) {
            return false;
        }
        this.bookList[this.index] = book;
        this.index++;
        return true;
    }

    public int addListBookToShelf(Book[] lisBooks) {
        if (lisBooks == null) {
            return -1;
        }
        if (this.index == this.bookList.length) {
            return 0;
        }
        int i = 0;
        for (Book book : lisBooks) {
            if (this.index < this.bookList.length) {
                this.bookList[this.index++] = book;
                i++;
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return "Ma ke sach: " + this.maKe + "; Vi tri: " + this.viTri + "; Sl sach dang co: " + (this.index);
    }

    public void xuatKeSach() {
        System.out.println(this);
        this.showBookList();
    }

    public Book findBookByCode(String maSach) {
        if (maSach == null || maSach.length() == 0) {
            return null;
        }
        for (int i = 0; i < this.index; i++) {
            if (maSach.equalsIgnoreCase(this.bookList[i].getMaSach())) {
                return this.bookList[i];
            }
        }
        return null;
    }

}
