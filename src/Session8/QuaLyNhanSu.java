package Session8;

import java.text.ParseException;
import java.time.Period;
import java.util.ArrayList;

import Session7.People;
import Session7.Student;

public class QuaLyNhanSu {
    private ArrayList<People> dsNhanSu;

    public QuaLyNhanSu() {
        this.dsNhanSu = new ArrayList<People>();
    }

    public ArrayList<People> getDsNhanSu() {
        return this.dsNhanSu;
    }

    public void setDsNhanSu(ArrayList<People> dsNhanSu) {
        this.dsNhanSu = dsNhanSu;
    }

    public boolean themNhanSu(People people) {
        if (people != null) {
            return this.dsNhanSu.add(people);
        }
        return false;
    }

    public ArrayList<People> timDsTheoTen(String name) {
        ArrayList<People> result = new ArrayList<People>();
        if (name == null) {
            return result;
        }
        for (People people : this.dsNhanSu) {
            if (people.getFullName().contains(name)) {
                result.add(people);
            }
        }

        return result;
    }

    public int updateGiangVien(String magv) throws ParseException {
        if (magv == null || magv.length() == 0) {
            return -1;
        }
        int index = this.timGVtuMa(magv);
        if (index == -1) {
            return 0;
        }
        GiangVien gv = (GiangVien) this.dsNhanSu.get(index);
        System.out.print("\nNhap lai thong tin cua GV: ");
        gv.inputInfo();
        if (this.dsNhanSu.set(index, gv) != null) {
            return 1;
        }
        return 2;
    }

    public int timGVtuMa(String magv) {
        if (magv == null || magv.length() == 0)
            return -1;
        for (int i = 0; i < this.dsNhanSu.size(); i++) {
            People people = this.dsNhanSu.get(i);
            if (people instanceof GiangVien) {
                GiangVien gv = (GiangVien) people;
                if (magv.equals(gv.getMaGV())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void showDsNhanSu(int type) {
        switch (type) {
        case 0:
            for (People people : this.dsNhanSu) {
                System.out.println(people);
            }
            break;
        case 1:
            for (People people : this.dsNhanSu) {
                if (people instanceof Student) {
                    System.out.println(people.toString());
                }
            }
            break;
        case 2:
            System.out.println("Ds giang vien: ");
            for (People people : this.dsNhanSu) {
                if (people instanceof GiangVien) {
                    System.out.println(people);
                }
            }
            break;
        default:
            break;
        }
    }
}
