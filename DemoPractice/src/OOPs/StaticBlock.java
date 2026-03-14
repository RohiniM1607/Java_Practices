package OOPs;



public class StaticBlock {
	static int empId;
	static String empName;
	static{
		System.out.println("Static Block 1");
		empId = 1001;
		empName = "Alex";
	}
	static{
		System.out.println("Static Block 2");
		empId = 1002;
		empName = "Peter";
	}


	public static void main(String[] args) {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
	}

}
