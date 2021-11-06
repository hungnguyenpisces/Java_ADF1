package Session8.Assignment.ThuVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TapChi extends TaiLieu {
    private Date thangPhatHanh;
    SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");

    public TapChi() {
    }

    public TapChi(String tenTaiLieu, String nhaXB, int soPhatHanh, Date thangPhatHanh) {
        super(tenTaiLieu, nhaXB, soPhatHanh);
        this.thangPhatHanh = thangPhatHanh;
    }

    public Date getThangPhatHanh() {
        return this.thangPhatHanh;
    }

    public void setThangPhatHanh(Date thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public void inputTapChi() {
        super.inputTaiLieu();
        do {
            System.out.print("\nThang phat hanh (MM/yyyy): ");
            try {
                this.thangPhatHanh = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } while (this.thangPhatHanh == null);
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " thangPhatHanh='" + sdf.format(getThangPhatHanh()) + "'" + "}";
    }

}
