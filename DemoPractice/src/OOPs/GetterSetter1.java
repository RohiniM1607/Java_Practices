package OOPs;

class GetSet1{
	private int empId;
	private String empName;
	public void setId(int id) {
		empId = id;
	}
	public void setName(String name) {
		empName=name;
	}
		
	public int getId() {
		return empId;
	}
		
	public String getName(){
		return empName;
	}

}

public class GetterSetter1 {

	public static void main(String[] args) {
		GetSet1 emp= new GetSet1(); 
		emp.setId(1001);
		emp.setName("Ram Kumar");
		
		System.out.println("Employee Id: "+emp.getId());
		System.out.println("Employee Name: "+emp.getName());
	}

}
