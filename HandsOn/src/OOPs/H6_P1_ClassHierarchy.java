package OOPs;

import java.util.Scanner;
class Person{
	String name;
	String address;
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Person[name = "+name+", address = "+address+"]";
	}
	
}

class Student extends Person{
	String program;
	int year;
	double fee;
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address +
			   ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
}

class Staff extends Person{
	String school;
	double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + 
			   ", school=" + school + ", pay=" + pay + "]";
	}
	
}

public class H6_P1_ClassHierarchy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n----- MENU -----");
			System.out.println("1. Create Person");
			System.out.println("2. Create Student");
			System.out.println("3. Create Staff");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {

			case 1:
				System.out.print("Enter Name: ");
				String pname = sc.nextLine();

				System.out.print("Enter Address: ");
				String paddr = sc.nextLine();

				Person p = new Person(pname, paddr);
				System.out.println(p);
				break;

			case 2:
				System.out.print("Enter Name: ");
				String sname = sc.nextLine();

				System.out.print("Enter Address: ");
				String saddr = sc.nextLine();

				System.out.print("Enter Program: ");
				String prog = sc.nextLine();

				System.out.print("Enter Year: ");
				int year = sc.nextInt();

				System.out.print("Enter Fee: ");
				double fee = sc.nextDouble();
				sc.nextLine();

				Student s = new Student(sname, saddr, prog, year, fee);
				System.out.println(s);
				break;

			case 3:
				System.out.print("Enter Name: ");
				String stname = sc.nextLine();

				System.out.print("Enter Address: ");
				String staddr = sc.nextLine();

				System.out.print("Enter School: ");
				String school = sc.nextLine();

				System.out.print("Enter Pay: ");
				double pay = sc.nextDouble();
				sc.nextLine();

				Staff st = new Staff(stname, staddr, school, pay);
				System.out.println(st);
				break;

			case 4:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while(choice != 4);

	}

}
