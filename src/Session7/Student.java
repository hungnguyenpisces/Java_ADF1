package Session7;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Student extends People {
    private String studentCode, classCode;
    Scanner sc = new Scanner(System.in);

    public Student() {
    }

    public Student(String fullName, String address, String phone, String email, Date birthDay, char gentle,
            String studentCode, String classCode) {
        super(fullName, address, phone, email, birthDay, gentle);
        this.setStudentCode(studentCode);
        this.setClassCode(classCode);
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public void inputStudent() throws ParseException {
        super.inputInfo();
        System.out.println("Student code: ");
        this.studentCode = sc.nextLine();
        System.out.println("Class code: ");
        this.classCode = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() + "studentCode=" + studentCode + ", classCode=" + classCode + "]";
    }

    @Override
    public void inputInfo() throws ParseException {
        super.inputInfo();
        System.out.println("Student code: ");
        this.studentCode = sc.nextLine();
        System.out.println("Class code: ");
        this.classCode = sc.nextLine();
    }

    public void diHoc() {
        System.out.println(" Hoc 3, 5, 7 18h toi");
    }

}
