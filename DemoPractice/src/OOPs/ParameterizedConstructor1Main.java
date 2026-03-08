

package OOPs;

class ParameterizedConstructor1{
	int empId;
	String empName;
	
	ParameterizedConstructor1(int id, String name){
		empId=id; 
		empName=name; 
	}
	void getDetails (){
		System.out.println("User given initial employee id is: "+empId);
		System.out.println("User given initial employee name is: "+empName);
	}
	
}
public class ParameterizedConstructor1Main {

	public static void main(String[] args) {
		ParameterizedConstructor1 par= new ParameterizedConstructor1(1003,"Peter");
		par.getDetails();
	}

}
