package OOPs;
class DConstructor1{
	int empId;
	String empName;
	void getEmployeeDetails () {
		System.out.println("The default Initial value of employee id is: "+empId);
		System.out.println("The default Initial value of employee name is: "+empName);
	}
}

public class DefaultConstructor1 {

	public static void main(String[] args) {
		DConstructor1 con= new DConstructor1();
		con.getEmployeeDetails();
	}

}
