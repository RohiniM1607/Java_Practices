package OOPs;
class This2{
	int empId;
	String empName;
	This2(String empName, int empId ) {
		this.empName = empName;
		this.empId = empId;
	}
	void display() {
		System.out.println(empName+ " \t"+ empId);
	}
}

public class ThisKeyword2 {

	public static void main(String[] args) {
		This2 emp = new This2("Manas Kumar",29);
		emp.display();
	}

}
