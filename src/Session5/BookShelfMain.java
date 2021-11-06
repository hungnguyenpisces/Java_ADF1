package Session5;

import java.util.Scanner;

public class BookShelfMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Chuong trinh quan lys ke sach");
        String confirm = "";
        BookShelf shelfTruyenTranh = new BookShelf();
        do {
            System.out.println("1. nhap thong tin ke sach");
            System.out.println("2. hien thi thong tin ke sach");
            System.out.println("3. them 1 quyen sach vao ke");
            System.out.println("4. them tap sach vao ke");
            System.out.println("5. tim sach tu ma sach");
            System.out.println("6. thoat");

            System.out.println("Nhap lua chon");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1. nhap thong tin ke sach");
                    shelfTruyenTranh.inputBookShelf();
                    break;
                case 2:
                    System.out.println("2. hien thi thong tin ke sach");
                    shelfTruyenTranh.xuatKeSach();
                    break;
                case 3:
                    System.out.println("3. them 1 quyen sach vao ke");
                    Book newBook = new Book();
                    newBook.inputBook();
                    if (shelfTruyenTranh.addBookToShelf(newBook)) {
                        System.out.println("Them quyen sach vao ke thanh cong");
                    } else {
                        System.out.println("them sach vao ke that bai");
                    }
                    break;
                case 4:
                    System.out.println("4. them tap sach vao ke");
                    ThemThungSach(shelfTruyenTranh);
                    break;
                case 5:
                    System.out.println("5. tim sach tu ma sach");
                    TimSach(shelfTruyenTranh);
                    break;
                case 6:
                    System.out.println("6. thoat");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
            if (choose == 6) {
                break;
            }
            sc.nextLine();
            System.out.println("Ban co muon tiep tuc?(N=no)");
            confirm = sc.nextLine();
        } while (!"n".equalsIgnoreCase(confirm));
    }

    public static void ThemThungSach(BookShelf shelf) {
        int soluong = 0;
        do {
            System.out.println("Ban muon nhap bnhiu quyen sach: ");
            soluong = sc.nextInt();
        } while (soluong <= 0);
        Book[] inputBooks = new Book[soluong];
        for (int i = 0; i < soluong; i++) {
            Book book = new Book();
            book.inputBook();
            inputBooks[i] = book;
        }
        int slbookadded = shelf.addListBookToShelf(inputBooks);
        System.out.println("Co " + slbookadded + " da duoc them thanh cong vao ke");
    }

    public static void TimSach(BookShelf shelf) {
        System.out.println("Nhap ma sach can tim: ");
        String maSach = sc.nextLine();
        Book result = shelf.findBookByCode(maSach);
        if (result == null) {
            System.out.println("Ma sach" + maSach + " khong tim thay trong ke");
        } else {
            System.out.println("Sach can tim: " + result);
        }
    }
}