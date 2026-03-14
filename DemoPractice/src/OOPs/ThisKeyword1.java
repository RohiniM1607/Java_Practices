package OOPs;

class This1 {
	int empId; 
	String empName; 
	This1(String empName, int empId ) {
		empName = empName;
		empId = empId;
	}
	void display() {
		System.out.println(empName+ " \t"+ empId);
	}

}
public class ThisKeyword1 {

	public static void main(String[] args) {
		This1 emp = new This1("Manas Kumar",29);
		emp.display();
	}

}
