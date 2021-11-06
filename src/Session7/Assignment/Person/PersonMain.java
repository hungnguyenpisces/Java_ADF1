package Session7.Assignment.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) throws ParseException {
        ClearConsole screen = new ClearConsole();
        Scanner sc = new Scanner(System.in);
        String confirm = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<Person> listPerson = new ArrayList<Person>();
        for (int i = 0; i < 5; i++) {
            Person ps = new Person("Person" + (i + 1), "m", "HN" + (i + 1),
                    sdf.parse((i + 1) + "/" + (i + 1) + "/2000"));
            listPerson.add(ps);
        }
        ArrayList<Student> listStudent = new ArrayList<Student>();
        for (int i = 0; i < 5; i++) {
            Student st = new Student("Student" + (i + 1), "f", "HN" + (i + 1),
                    sdf.parse((i + 1) + "/" + (i + 1) + "/200" + (i + 1)), "maSV" + i, "email" + i, (i + 5));
            listStudent.add(st);
        }
        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
        for (int i = 0; i < 5; i++) {
            Teacher tc = new Teacher("Teacher" + (i + 1), "o", "diaChi" + (i + 1),
                    sdf.parse((i + 1) + "/" + (i + 1) + "/1988"), "English", (i + 50), (i + 50));
            listTeacher.add(tc);
        }
        screen.clear();
        do {
            System.out.println("Chuong trinh quan ly nhan su");
            System.out.println("1. Nhap Nguoi & them Nguoi");
            System.out.println("2. Nhap Giang vien & them giang vien");
            System.out.println("3. Nhap Sinh vien & them Sinh vien");
            System.out.println("4. Hien thi toan bo danh sach nhan su");
            System.out.println("5. HIen thi danh sach SV bao gom xep loai");
            System.out.println("6. Hien thi danh sach GV + luong");
            System.out.println("7. Thoat chuong trinh");
            System.out.print("\nNhap lua chon: ");
            int choose = sc.nextInt();

            switch (choose) {
            case 1:
                screen.clear();
                System.out.println("1. Nhap Nguoi & them Nguoi");
                Person ps1 = new Person();
                ps1.inputPerson();
                listPerson.add(ps1);
                break;
            case 2:
                screen.clear();
                System.out.println("2. Nhap Giang vien & them giang vien");
                Teacher tc1 = new Teacher();
                tc1.inputTeacher();
                listTeacher.add(tc1);
                break;
            case 3:
                screen.clear();
                System.out.println("3. Nhap Sinh vien & them Sinh vien");
                Student st1 = new Student();
                st1.inputStudent();
                listStudent.add(st1);
                break;
            case 4:
                screen.clear();
                System.out.println("4. Hien thi toan bo danh sach nhan su");
                System.out.println("Danh sach Person:");
                for (Person person : listPerson) {
                    System.out.println(person);
                }
                System.out.println("Danh sach SV:");
                for (Student student : listStudent) {
                    System.out.println(student);
                }
                System.out.println("Danh sach GV:");
                for (Teacher teacher : listTeacher) {
                    System.out.println(teacher);
                }
                break;
            case 5:
                screen.clear();
                System.out.println("5. HIen thi danh sach SV bao gom xep loai");
                System.out.println("Danh sach SV:");
                for (Student student : listStudent) {
                    System.out.println(student);
                }
                break;
            case 6:
                screen.clear();
                System.out.println("6. Hien thi danh sach GV + luong");
                System.out.println("Danh sach GV:");
                for (Teacher teacher : listTeacher) {
                    System.out.println(teacher);
                }
                break;
            case 7:
                screen.clear();
                break;
            default:
                screen.clear();
                System.out.println("lua chon ko hop le");
                break;
            }
            if (choose == 7) {
                break;
            }
            sc.nextLine();
            System.out.println("Ban co muon tiep tuc?");
            confirm = sc.nextLine();
            screen.clear();
        } while (!"n".equalsIgnoreCase(confirm));
    }
}
