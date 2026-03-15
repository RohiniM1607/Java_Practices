/*
 * The class P1_MyCalculator implements the program 
 * that illustrates to reads input values from the user using
 * Scanner, calls the powCalculate method to compute the
 * power of the number, and handles exceptions if invalid
 * values are provided.
 */
package ExceptionHandling;

import java.util.Scanner;

class MyCalculator{
	int powCalculate(int n, int p) throws Exception{
		if(n==0 && p==0)
			throw new Exception("n and p should not be zero");
		else if(n<0 || p<0)
			throw new Exception("n or p should not be negative");
		else
			return (int)Math.pow(n, p);
	}
}

public class P1_MyCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyCalculator cal = new MyCalculator();
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			
			try {
				System.out.println(cal.powCalculate(n, p));
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}

}
