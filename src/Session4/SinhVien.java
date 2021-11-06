package Session4;

import java.util.Scanner;

public class SinhVien {
    // b1: táº¡o cÃ¡c biáº¿n instance
    private String name;
    private int age;
    private String phone;
    private String address;

    // b2 táº¡o hÃ m constructor
    public SinhVien() {
        super();
    }

    public SinhVien(String name, int age, String phone, String address) {
        super();
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    // b3 táº¡o hÃ m set/get
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // b4 táº¡o cÃ¡c hÃ m nghiá»‡p vá»¥ chán như con gián

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin SV:");
        System.out.println("Ten SV:");
        this.name = sc.nextLine();
        while (this.age <= 0) {
            System.out.println("Nhap tuoi:");
            this.age = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Nhap phone:");
        this.phone = sc.nextLine();
        System.out.println("Nhap dia chi:");
        this.address = sc.nextLine();
        sc.close();
    }

    @Override
    public String toString() {
        return "Sinh Vien \nname:" + name + "\ntuoi:" + age + "\nphone:" + phone + "\nadd:" + address;
    }
}
