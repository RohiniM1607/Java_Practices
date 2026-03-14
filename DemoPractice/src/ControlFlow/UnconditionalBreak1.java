package ControlFlow;

public class UnconditionalBreak1 {

	public static void main(String[] args) {
		for(int count = 1; count<10; count++) {
			if(count == 5)
				break;
			System.out.println("Count is "+count);
		}
	}

}
