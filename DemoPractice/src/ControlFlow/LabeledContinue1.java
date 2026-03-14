package ControlFlow;

public class LabeledContinue1 {

	public static void main(String[] args) {
		first: 
		for (int i = 0 ; i < 3; i++) {
			second:
			for (int j = 0; j < 3; j++) {
				if (1 == i && 1 == j) {
					continue second;
				}
				System.out.println(i + " " + j);
			}
		}

	}

}
