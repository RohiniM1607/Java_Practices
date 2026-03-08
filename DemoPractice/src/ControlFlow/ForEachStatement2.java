package ControlFlow;

import java.util.Scanner;

public class ForEachStatement2 {

	public static void main(String[] args) {
		String MovieName[] = {"AAA","BBB","CCC","DDD"};
		String MovieGenre[] = {"ACTION","COMEDY","THRILLER","ACTION"};
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Genre to be searched : ");
		String Genre = sc.next();
		int counter = 0;
		System.out.println(Genre + " Movies are");
		for (String M : MovieGenre ) {
			if(M.equals(Genre)) {
				System.out.println(MovieName[counter]);
			}
			counter++;
		}
		sc.close();
	}
	
}
