/*
 * The E2_FindPrimeNumber class implements the program
 * that illustrates to finding the prime numbers between
 * 1 to 100 using functions
 */

package Functions;

public class E2_FindPrimeNumbers {
	public static void findPrime(int start, int end) {
		for(int i=start; i<=end; i++) {
			int num = i;
			int count = 0;
			for(int j=1; j<num; j++) {
				if(num%j==0)
					count++;
			}
			if(count == 1)
				System.out.print(num+" ");
		}
	}

	public static void main(String[] args) {
		int start = 1, end = 100;
		findPrime(1, 100);    //Passing arguments to function
	}

}
