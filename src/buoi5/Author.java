package buoi5;

import java.util.Scanner;

public class Author {
	// bien
	private String name;
	private String email;
	private int age;
	private String gender = "";
	// methods
	// constructor
	public Author() {
		super();
	}
	public Author(String name, String email, int age, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	//set/get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender.equalsIgnoreCase("m")?"Nam":(this.gender.equalsIgnoreCase("f")?"Nu":"Khac");
	}
	public void setGender(String gender) {
		this.gender = (gender == null)?"": gender.toUpperCase();
	}
	// nghiep vu
	public void nhapAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tac gia: ");
		System.out.println("Ten: ");
		this.name = sc.nextLine();
		System.out.println("Email: ");
		this.email = sc.nextLine();
		while (this.age <= 0) {
			System.out.println("Tuoi: ");
			this.age = sc.nextInt();
		}
		sc.nextLine();
		do {
			System.out.println("Gioi tinh (m: nam, f: nu, o: khac)");
			this.setGender(sc.nextLine());
		}while(!"m".equalsIgnoreCase(this.gender) 
				&& !"f".equalsIgnoreCase(this.gender) 
				&& !"o".equalsIgnoreCase(this.gender) );
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", age=" + age + ", gender=" + this.getGender() + "]";
	}
	
}
