package Session7;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentMain {
    public static void main(String[] args) throws ParseException {
        People pp1 = new People();
        Student st1 = new Student();
        People pp2 = new Student();

        System.out.println(pp2 instanceof People);
        System.out.println(pp1 instanceof Student);

        System.out.println("nhap tt pp2: ");
        // pp2.inputInfo();
        // System.out.println(pp2);
        pp2 = pp1;
        pp2 = st1;
        System.out.println("nhap tt st2");
        Student st2 = (Student) pp2;
        // st2.inputInfo();
        // System.out.println(st2);
        // System.out.println(st1);
        // System.out.println(pp2);

        Student[] dssv = new Student[100];
        // dssv[0] = new People();
        People[] dsnhansu = new People[1000];
        dsnhansu[0] = new Student();
        ArrayList<People> dsnhansu2 = new ArrayList<People>();
        dsnhansu2.add(new People());
        dsnhansu2.add(new Student());
        dsnhansu2.add(st1);
        System.out.println("Duyet ds nhan su: ");
        for (People people : dsnhansu2) {
            System.out.println(people.toString());
            if (people instanceof Student) {
                Student sv = (Student) people;
                sv.diHoc();
            }
        }

        /*
         * ArrayList list = new ArrayList<>(); list.add(1); list.add(5); list.add(null);
         * list.add(1); System.out.println("size: " + list.size()); list.remove(null);
         * System.out.println("size: " + list.size()); list.set(0, 2);
         * System.out.println("forEach"); for (Object obj : list) {
         * System.out.println(obj); } System.out.println("iterator"); Iterator it =
         * list.iterator(); while (it.hasNext()) { System.out.println(it.next()); }
         * System.out.println("for index"); for (int i = 0; i < list.size(); i++) {
         * System.out.println(list.get(i)); }
         */

    }
}
