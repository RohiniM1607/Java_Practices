package OOPs;
class DefaultConstructor1{
	int empId;
	String empName;
	void getEmployeeDetails () {
		System.out.println("The default Initial value of employee id is: "+empId);
		System.out.println("The default Initial value of employee name is: "+empName);
	}
}

public class DefaultConstructor1Main {

	public static void main(String[] args) {
		DefaultConstructor1 con= new DefaultConstructor1();
		con.getEmployeeDetails();
	}

}
