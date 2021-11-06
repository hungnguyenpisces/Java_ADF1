package Session7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class People implements Comparable<People> {
    protected String fullName, address, phone, email;
    protected Date birthDay;
    protected char gentle;
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public People(String fullName, String address, String phone, String email, Date birthDay, char gentle) {
        super();
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthDay = birthDay;
        this.gentle = gentle;
    }

    public People() {
        super();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setGentle(char gentle) {
        this.gentle = gentle;
    }

    public Character getGentle() {
        return gentle;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void inputInfo() throws ParseException {
        System.out.println("Full name: ");
        this.fullName = sc.nextLine();
        while (this.birthDay == null) {
            System.out.println("Birthday: ");
            try {
                this.birthDay = sdf.parse(sc.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Gentle: ");
        this.gentle = (char) sc.nextByte();
        sc.nextLine();
        System.out.println("Address: ");
        this.address = sc.nextLine();
        System.out.println("Phone: ");
        this.phone = sc.nextLine();
        System.out.println("Email: ");
        this.email = sc.nextLine();
    }

    @Override
    public String toString() {
        return "People [fullName=" + fullName + ", address=" + address + ", phone=" + phone + ", email=" + email
                + ", birthDay=" + birthDay + ", gentle=" + gentle + "]";
    }

    @Override
    public int compareTo(People other) {
        if (other == null) {
            return -1;
        }
        int sosanhNS = this.getBirthDay().compareTo(other.getBirthDay());
        if (sosanhNS == 0) {
            char gt = this.getGentle();
            Character ch = other.getGentle();
            return other.getGentle().compareTo(this.getGentle());
        }

        return sosanhNS;
    }

}
