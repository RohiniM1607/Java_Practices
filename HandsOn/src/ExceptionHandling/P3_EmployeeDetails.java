/*
 * The class P3_EmployeeDetails implements a program that 
 * illustrates to reads employee details from the user,
 * validates the inputs using validation methods,
 * creates an EmployeeDetail object if the data is valid,
 * and handles any exceptions that occur during validation.
 */
package ExceptionHandling;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class InvalidEmployeeCodeException extends Exception {
	public InvalidEmployeeCodeException(String message) {
		super(message);
	}
}

class InvalidDateOfJoinException extends Exception{
	public InvalidDateOfJoinException(String message) {
		super(message);
	}
}

class EmployeeDetail{
	int empCode;
	String empName;
	LocalDate dob;
	LocalDate doa;
	public EmployeeDetail(int empCode, String empName, LocalDate dob, LocalDate doa) {
		this.empCode = empCode;
		this.empName = empName;
		this.dob = dob;
		this.doa = doa;
	}
	
	public void display() {
		System.out.println("Employee Code: "+ empCode);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Date of Birth: "+dob);
		System.out.println("Date of Appointment: "+doa);
		
		int experience = Period.between(doa, LocalDate.now()).getYears();
		System.out.println("Years of Experience: "+experience);
	}
	
	
}

public class P3_EmployeeDetails {
	public static void validateEmployeeCode(int empCode) throws InvalidEmployeeCodeException{
		if(empCode<0) {
			throw new InvalidEmployeeCodeException("Employee code must be a positive integer");
		}
	}
	
	public static void validateDateOfJoin(LocalDate dob, LocalDate doa) throws InvalidDateOfJoinException{
		if(!dob.isBefore(doa)) {
			throw new InvalidDateOfJoinException("DOB must be before Date of Appointment");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee code: ");
		int empCode = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Employee name: ");
		String empName = sc.nextLine();
		System.out.print("Enter the Date of birth: ");
		LocalDate dob = LocalDate.parse(sc.nextLine());
		System.out.print("Enter the Date of appointment: ");
		LocalDate doa = LocalDate.parse(sc.nextLine());
		
			
		try {
			validateEmployeeCode(empCode);
			validateDateOfJoin(dob, doa);
			EmployeeDetail emp = new EmployeeDetail(empCode, empName, dob, doa);
			emp.display();
		}
		catch(InvalidEmployeeCodeException | InvalidDateOfJoinException e) {
			System.out.println(e.getMessage());
		}
	}

}
