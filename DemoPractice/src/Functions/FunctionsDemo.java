package Functions;

public class FunctionsDemo {
	public static int addTwoInt(int a, int b){ 
		return a+b;
	}


	public static void main(String[] args) {
		int sum;
		sum=addTwoInt(5,6); //5, 6 is arguments
		System.out.println("Sum of two integer values :"+ sum);
	}

}
