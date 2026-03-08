/*
 * This program implements a secure Employee Attendance Management
 * System to record and monitor employees’ daily check-in and
 * check-out activities. The system ensures that an employee can
 * check in only once and check out only after a valid check-in.
 */
package OOPs;

import java.time.LocalTime;

class Employee{
	private int empId;
	private String empName;
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	public void markCheckIn(Attendance attendance) {
		attendance.markCheckIn();
	}
	public void markCheckOut(Attendance attendance) {
		attendance.markCheckOut();
	}
}

class Attendance{
	private int empId;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private boolean isCheckedIn;
	private boolean isCheckedOut;
	
	Attendance(int empId){
		this.empId = empId;
	}
	
	public void markCheckIn() {
		if(!isCheckedIn) {
			checkInTime = LocalTime.now();
			isCheckedIn = true;
			System.out.println(" Check-In at "+checkInTime);
		}
		else
			System.out.println("Already CheckedIn");
	}
	
	public void markCheckOut() {
		if(isCheckedIn && !isCheckedOut) {
			checkOutTime = LocalTime.now();
			isCheckedOut = true;
			System.out.println("Check-out at "+checkOutTime);
		}
		else
			System.out.println("CheckedOut Not Allowed");
	}
	public void getAttendanceDetails() {
		System.out.println("Employee ID: "+empId);
		//System.out.println("Employee Name: "+empName);
		System.out.println("Check-In Time: "+checkInTime);
		System.out.println("Check-Out Time: "+checkOutTime);
		
	}
	
}

public class P2_EmployeeAttendanceManagement {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Rohini");
        Attendance att = new Attendance(101);
        emp.markCheckOut(att);

        emp.markCheckIn(att);

        emp.markCheckIn(att);

        emp.markCheckOut(att);

        emp.markCheckOut(att);

        att.getAttendanceDetails();
				
	} 

}
