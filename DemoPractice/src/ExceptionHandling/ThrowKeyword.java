package ExceptionHandling;

public class ThrowKeyword {
	static void validate(int num){
		if(num<0)
			throw new ArithmeticException("Invalid value");
		else
			System.out.println("Valid to proceed");
	}

	public static void main(String[] args) {
		try{
			validate(-10);
			}
			catch(Exception e){
			System.out.println("Error:"+e);
			}
			System.out.println("rest of the code...");
	}

}
