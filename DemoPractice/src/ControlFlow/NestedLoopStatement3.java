package ControlFlow;

public class NestedLoopStatement3 {

	public static void main(String[] args) {
		int outerLabel= 1;
		do {
			int innerLabel = 1;
			do{
				System.out.print(outerLabel);
				innerLabel++;
			} while (innerLabel <= 3);
			outerLabel++;
		} while (outerLabel <= 3);

	}

}
