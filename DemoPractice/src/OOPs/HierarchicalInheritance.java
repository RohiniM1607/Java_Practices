package OOPs;

class Person{
	String name;
	String address;
	public Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person[name= "+name+", address= "+address+"]";
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
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + ", name=" + name + ", address="
				+ address + "]";
	}
	
	
}

class Staff extends Person{
	private String school;
	private double pay;
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
		return "Staff [school=" + school + ", pay=" + pay + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Student s1 = new Student("Rohini", "Salem", "B.E CSE", 3, 75000);
		Staff st1 = new Staff("Arun", "Chennai", "ABC Engineering College", 45000);

		System.out.print("Student Details: ");
		System.out.println(s1);

		System.out.print("Staff Details: ");
		System.out.println(st1);

		s1.setAddress("Coimbatore");
		st1.setPay(10000);
		
		System.out.println("After set details");
		System.out.print("Student Details: ");
		System.out.println(s1);

		System.out.print("Staff Details: ");
		System.out.println(st1);
	}

}
