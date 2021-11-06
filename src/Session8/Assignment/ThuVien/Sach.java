package Session8.Assignment.ThuVien;

public class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTaiLieu, String nhaXB, int soPhatHanh, String tacGia, int soTrang) {
        super(tenTaiLieu, nhaXB, soPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return this.tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return this.soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void inputSach() {
        super.inputTaiLieu();
        System.out.print("\nTen tac gia: ");
        this.tacGia = sc.nextLine();
        System.out.print("\nSo trang sach: ");
        this.soTrang = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " tacGia='" + getTacGia() + "'" + ", soTrang='" + getSoTrang() + "'" + "}";
    }

}
