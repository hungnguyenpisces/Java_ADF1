package Session8.Assignment.ThuVien;

import java.util.ArrayList;

import Session8.Assignment.ThuVien.TaiLieu;

public class QuanLyThuVien {
    private ArrayList<TaiLieu> dsTaiLieu;

    public QuanLyThuVien() {
        this.dsTaiLieu = new ArrayList<TaiLieu>();
    }

    public ArrayList<TaiLieu> getDsTaiLieu() {
        return this.dsTaiLieu;
    }

    public void setDsTaiLieu(ArrayList<TaiLieu> dsTaiLieu) {
        this.dsTaiLieu = dsTaiLieu;
    }

    public boolean themTaiLieu(TaiLieu tailieu) {
        if (tailieu != null) {
            return this.dsTaiLieu.add(tailieu);
        }
        return false;
    }
}
