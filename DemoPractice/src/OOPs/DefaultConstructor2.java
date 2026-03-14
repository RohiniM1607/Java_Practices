package OOPs;

class DConstructor2 { 
	int empId;
	String empName;

	DConstructor2() {
		empId=1111; 
		empName="AAA-BBB"; 
	}
	void getEmployeeDetails () {
		System.out.println("The Initial value of employee id is: "+empId);
		System.out.println("The Initial value of employee name is: "+empName);
	}
}

public class DefaultConstructor2 {

	public static void main(String[] args) {
		DConstructor2 emp= new DConstructor2();
		emp.getEmployeeDetails();
	}

}
