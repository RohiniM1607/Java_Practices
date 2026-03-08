/*
 * The E1_EvenOddArraySum class implements the program
 * that illustrates adding even and odd numbers from 1 to 10
 * using for loop and storing the result in two different array.
 */

package Arrays;

public class E1_EvenOddArraySum {

	public static void main(String[] args) {
		int []even = new int[5];    //Array with even elements
		int []odd = new int[5];     //Array with odd elements
		int e = 0, o=0;             //Represent the index of each array
		int evenCount = 0, oddCount = 0;   //Stored the count 
		for(int i=1; i<=10; i++) {
			if(i%2==0) {            //Even numbers
				even[e++] = i;
				evenCount+=i;
			}
			else {                  //Odd Numbers
				odd[o++] = i;
				oddCount+=i;
			}
		}
		System.out.print("Even Elements: ");      //Display the even elements
		for(int i=0; i<5; i++)
			System.out.print(even[i]+" ");
		System.out.print("\nOdd Elements: ");     //Display the odd elements
		for(int i=0; i<5; i++)
			System.out.print(odd[i]+" ");
		System.out.println("\nEven count = "+evenCount);      //Display the count even even elements
		System.out.println("Odd count = "+oddCount);          //Display the count even even elements
	}

}
