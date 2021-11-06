package Session4;

public class LopHoc {
    // fields - biến íntance: đặc điểm của các đối tượng -> khai báo
    // private: trong lop
    private String tenLop;
    // default: trong lớp, cùng package
    int namHoc;
    // trong lop, class cùng package, các lớp con
    protected int soLuongHv;
    // mọi nơi
    public String phongHoc;

    // method
    // phạm vi truy cập - kiểu return - tên hàm (tham số){thân hàm}
    // hàm khởi tạo - constructor ** ko có kiểu return

    public LopHoc(String name, int year) {
        tenLop = name;
        namHoc = year;

    }

    // overloading nạp chồng, cùng lớp có thể tạo nhiều hàm giống tên.
    // nhưng phải khác nhau danh sách tham số
    public LopHoc() {

    }

    // this:
    // chỉ được xuất hiện trong hàm instance
    // ko đc xuất hiện trong hàm static
    public LopHoc(String tenLop, int namHoc, int soLuongHv, String phongHoc) {
        this.tenLop = tenLop;
        this.namHoc = namHoc;
        this.soLuongHv = soLuongHv;
        this.phongHoc = phongHoc;
    }

    public void show() {
        System.out.println("Ten lop: " + " " + this.tenLop + "\n" + "Nam hoc: " + " " + this.namHoc + "\n"
                + "So luong hv: " + " " + this.soLuongHv + "\n" + "Phong hoc: " + " " + this.phongHoc);
    }

    public String getInfo() {
        String result = "";
        result = String.format("Ten lop: %s; nam hoc: %d; slhv: %d; phong hoc: %s%n", this.tenLop, this.namHoc,
                this.soLuongHv, this.phongHoc);
        return result;
    }

    // get: cho class khacs lấy thuộc tính từ bên ngoài class
    public String getTenLop() {
        return this.tenLop;
    }

    // set: gán giá trị cho thuộc tính
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public static void main(String[] args) {
        // tạo đối tượng
        LopHoc t2104e = new LopHoc();
        t2104e.tenLop = "T2104E";
        t2104e.namHoc = 2020;
        t2104e.soLuongHv = 22;
        t2104e.phongHoc = "B8";

        LopHoc t2103e = new LopHoc();
        t2103e.tenLop = "T2103E";
        t2103e.namHoc = 2020;
        t2103e.soLuongHv = 16;
        t2103e.phongHoc = "B8";

        LopHoc t2105e = new LopHoc("T2105E", 2020, 15, "C5");
        // t2105e.show();
        System.out.println("test" + t2105e.getInfo());
    }

}
