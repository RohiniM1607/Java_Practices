package ControlFlow;

public class NestedLoopStatement1 {

	public static void main(String[] args) {
		int outerLoop=1,innerLoop=1;
		while(outerLoop<=5){
			while(innerLoop<=5){
				System.out.print("*");
				innerLoop++;
			}
			System.out.println(" ");
			outerLoop++;
			innerLoop=1;
		}
	}

}
