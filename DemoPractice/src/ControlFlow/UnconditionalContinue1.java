package ControlFlow;

public class UnconditionalContinue1 {

	public static void main(String[] args) {
		for(int count = 1;count<10;count++) {
			if(count ==5)
				continue;
			System.out.println("Count is: " + count);
		}
	}

}
