/*
 * The H2_MaximumPlacement class implements the program
 * that illustrates to find the maximum number of placement
 * in college using function
 */

package Functions;

import java.util.Scanner;

public class H2_MaximumPlacement {
	public static void maxPlacement(int cs, int ec, int me) {
		if(cs < 0 || ec < 0 || me < 0) {
            System.out.println("Invalid input");
            return;
        }
        if(cs == ec && cs == me) {
            System.out.println("None of the department has got the highest placement");
        }
        else if(cs > ec && cs > me) {
            System.out.println("Highest Placement: CS");
        }

        else if(ec > cs && ec > me) {
            System.out.println("Highest Placement: EC");
        }

        else if(me > cs && me > ec) {
            System.out.println("Highest Placement: ME");
        }

        else if(cs == ec && cs > me) {
            System.out.println("Highest Placement: CS and EC");
        }
        else if(cs == me && cs > ec) {
            System.out.println("Highest Placement: CS and ME");
        }
        else if(ec == me && ec > cs) {
            System.out.println("Highest Placement: EC and ME");
        }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students placed in CS department: ");
		int cs = sc.nextInt();
		System.out.print("Enter the number of students placed in EC department: ");
		int ec = sc.nextInt();
		System.out.print("Enter the number of students placed in ME department: ");
		int me = sc.nextInt();
		maxPlacement(cs, ec, me);
	}

}
