package OOPs;

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
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + ", name=" + name + ", address="
				+ address + "]";
	}
}

class Staff extends Student{
	String school;
	double pay;
	public Staff(String name, String address, String program, int year, double fee, String school, double pay) {
		super(name, address, program, year, fee);
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

public class P1_ClassHierarchy {

	public static void main(String[] args) {
		
	}

}
