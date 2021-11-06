package buoi8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import buoi7.Nguoi;
import buoi7.SinhVien;

public class Buoi8Main {

    public static void main(String[] args) {
        /*
         * Nguoi ng1 = new Nguoi(); Nguoi ng2 = new SinhVien(); // GiangVien: abstract
         * Nguoi ng3 = new GiangVienFullTime(); Nguoi ng4 = new GiangVienPartTime();
         * GiangVien gv1 = new GiangVienFullTime(); GiangVien gv2 = new
         * GiangVienPartTime();
         */
        // loi runtime
        // ng3 = ng4;
        // gv1 = gv2;
        // ds chua sv, gv, nv
        QuanLyNhanSu fpt = new QuanLyNhanSu();

        // them SV:
        fpt.themNhanSu(
                new SinhVien("dungpt", new Date(2000, 11, 10), '0', "HN", "0987060850", "a@a.com", "sv001", "t2104e"));
        fpt.themNhanSu(
                new SinhVien("hapt", new Date(2001, 1, 10), '0', "HN", "0987060850", "a@a.com", "sv002", "t2104e"));
        // them GV
        fpt.themNhanSu(new GiangVienFullTime("dung pt", new Date(2000, 11, 10), '1', "HN", "0987060850", "a@a.com",
                "gv001", "gv001@fpt.edu.vn", 3, 2));
        fpt.themNhanSu(new GiangVienPartTime("hoa pt", new Date(2000, 11, 10), '0', "HN", "0987060850", "a@a.com",
                "gv002", "gv002@fpt.edu.vn", 50));
        fpt.themNhanSu(new Nguoi("dung", new Date(), '1', "HN", "0987060850", "a@a.com"));

        // hien thi ds
        fpt.showDsNhansu(2);
        fpt.showDsNhansu(1);
        System.out.println("-----------DS CHUA SAP XEP--------");
        fpt.showDsNhansu(0);

        // update 1 gv theo magv
        String magv = "gv0010";
        int updated = fpt.updateGiangVien(magv);
        if (updated == 1) {
            System.out.println("Update thanh cong");
        } else {
            System.out.println("Update that bai hoac dau vao khong dung.");
        }
        // sap xep
        // Collections.sort(fpt.getDsNhanSu());
        System.out.println("-----------DS SAU SAP XEP--------");
        fpt.showDsNhansu(0);
        // sap xep tang dan luong cua gv:
        // Collections.sort(fpt.getDsNhanSu(), new SapGiamDanTheoTenNhanSu());

        Collections.sort(fpt.getDsNhanSu(), new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                if (o1 == null || o2 == null)
                    return -1;
                return o2.getHoTen().compareTo(o1.getHoTen());
            }
        });
        System.out.println("-----------DS NGUOI SAU GiamDanTheoTenNhanSu-------");
        fpt.showDsNhansu(0);
    }
}
