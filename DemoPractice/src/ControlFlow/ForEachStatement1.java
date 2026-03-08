package ControlFlow;

public class ForEachStatement1 {

	public static void main(String[] args) {
		int[] marks = { 125, 132, 95, 116, 110 };
		int maxSoFar = marks[0];
		for (int indexValue : marks){
			if (indexValue > maxSoFar){
				maxSoFar = indexValue;
			}
		}
		System.out.println("The highest score is " +maxSoFar);

	}

}
