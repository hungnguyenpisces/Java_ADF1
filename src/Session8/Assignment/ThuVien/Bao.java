package Session8.Assignment.ThuVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bao extends TaiLieu {
    private Date ngayPhatHanh;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Bao() {
    }

    public Bao(String tenTaiLieu, String nhaXB, int soPhatHanh, Date ngayPhatHanh) {
        super(tenTaiLieu, nhaXB, soPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Date getNgayPhatHanh() {
        return this.ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void inputBao() {
        super.inputTaiLieu();
        do {
            System.out.print("\nNgay phat hanh (dd/MM/yyyy): ");
            try {
                this.ngayPhatHanh = sdf.parse(sc.nextLine());
            } catch (ParseException e) { 
                e.printStackTrace();
            }
        } while (this.ngayPhatHanh == null);
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " ngayPhatHanh='" + sdf.format(getNgayPhatHanh()) + "'" + "}";
    }

}
