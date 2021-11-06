package Session5;

import java.util.Scanner;

public class Author {
    private String authName, authEmail, gender = "";
    private int authAge;
    Scanner sc = new Scanner(System.in);

    public Author(String authName, String authEmail, String gender, int authAge) {
        this.authName = authName;
        this.authEmail = authEmail;
        this.gender = gender;
        this.authAge = authAge;
    }

    public Author() {
    }

    public void setAuthAge(int authAge) {
        this.authAge = authAge;
    }

    public int getAuthAge() {
        return authAge;
    }

    public void setAuthEmail(String authEmail) {
        this.authEmail = authEmail;
    }

    public String getAuthEmail() {
        return authEmail;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthName() {
        return authName;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? "" : gender.toUpperCase();
    }

    public String getGender() {
        return gender.equalsIgnoreCase("m") ? "Nam" : (this.gender.equalsIgnoreCase("f") ? "Nu" : "Khac");
    }

    public void inputAuth() {
        System.out.println("nhap tac gia");
        System.out.println("Ten: ");
        this.authName = sc.nextLine();
        System.out.println("Email: ");
        this.authEmail = sc.nextLine();
        do {
            System.out.println("Gioi tinh (m:Nam, f:Nu, o:Khac): ");
            this.setGender(sc.nextLine());
        } while (!"m".equalsIgnoreCase(this.gender) && !"f".equalsIgnoreCase(this.gender)
                && !"o".equalsIgnoreCase(this.gender));
        while (this.authAge <= 0) {
            System.out.println("Tuoi: ");
            this.authAge = sc.nextInt();
        }

    }

    @Override
    public String toString() {
        return "Tac gia [Ten: " + authName + "; Email: " + authEmail + "; Gioi tinh: " + this.getGender() + "; Tuoi: "
                + authAge + "]";
    }
}
