package Session5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book {
    private String maSach;
    private String bookName;
    private Author tacGia;
    private double giaSach;
    private Date namXuatBan;
    private String loaiSach;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
    Scanner sc = new Scanner(System.in);

    public Book() {
        this.tacGia = new Author();
    }

    public Book(String maSach, String bookName, Author tacGia, double giaSach, Date namXuatBan, String loaiSach) {
        this.maSach = maSach;
        this.bookName = bookName;
        this.tacGia = tacGia;
        this.giaSach = giaSach;
        this.namXuatBan = namXuatBan;
        this.loaiSach = loaiSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setTacGia(Author tacGia) {
        this.tacGia = tacGia;
    }

    public Author getTacGia() {
        return tacGia;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setNamXuatBan(Date namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public Date getNamXuatBan() {
        return namXuatBan;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void inputBook() {
        System.out.println("nhap thong tin sach");
        System.out.println("Ma sach: ");
        this.maSach = sc.nextLine();
        System.out.println("Ten sach: ");
        this.bookName = sc.nextLine();
        while (true) {
            System.out.println("Loai sach (VH,TT,DL,KH,NT): ");
            this.loaiSach = sc.nextLine();
            if (this.checkCategory()) {
                break;
            }
        }
        ;
        do {
            System.out.println("Ngay phat hanh (dd/MM/YYY): ");
            try {
                this.namXuatBan = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } while (this.namXuatBan == null);
        do {
            System.out.println("Gia sach: ");
            this.giaSach = sc.nextDouble();
        } while (this.giaSach <= 0);
        System.out.println("Tac gia: ");
        this.tacGia.inputAuth();
    }

    private boolean checkCategory() {
        String[] categories = { "VH", "TT", "DL", "KH", "NT" };
        for (String cate : categories) {
            if (cate.equals(this.loaiSach)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ma sach: " + this.maSach + "\nTen sach: " + bookName + "\nLoai sach:" + loaiSach + "\nPhat hanh: "
                + sdf.format(this.namXuatBan) + "\nGia sach: " + giaSach + "\n" + tacGia;
    }
}
