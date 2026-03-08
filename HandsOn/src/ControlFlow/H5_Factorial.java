package ControlFlow;

import java.util.Scanner;

public class H5_Factorial {
	public static int isFact(int num) {
		int fact = 1;
        int i = 1;

        while(fact < num)
        {
            i++;
            fact = fact * i;
        }
        if(fact == num)
        	return i;
        else
        	return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(num>0) {
			int res = isFact(num);
			if(res!=0)
				System.out.println(res);
			else
				System.out.println("Sorry. The given number is not a perfect factorial");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
