package Session4;

public class MainSession4 {
    public static void main(String[] args) {
        LopHoc t2102e = new LopHoc();
        t2102e.setTenLop("T2102E"); // thuộc tính private ko tham chiếu đc.
        t2102e.namHoc = 2020;
        t2102e.soLuongHv = 20;
        t2102e.phongHoc = "C1";
        
        t2102e.getInfo();
    }
}
