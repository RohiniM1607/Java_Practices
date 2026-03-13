package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	public int empId;
	public String empName;
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	
}


public class SerializationDeserialization {

	public static void main(String[] args) {
		Employee object = new Employee(1, "Ram");
		String filename = "file.ser";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		
		Employee object1 = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			object1 = (Employee)in.readObject();
			System.out.println("Object has been deseralized");
			System.out.println("Employee Id= "+object1.empId+"Employee Name= "+object1.empName);
		}
		catch(IOException ex){
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

}
