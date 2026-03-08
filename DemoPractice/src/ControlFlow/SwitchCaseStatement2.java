package ControlFlow;

import java.util.Scanner;

public class SwitchCaseStatement2 {

	public static void main(String[] args) {
		System.out.println("Enter the type to be search \n1. Search by Title \n2. Search by Language \n3. Search by Release Date \n4. Search by Genre \nEnter the Choice (1/2/3/4)");
				Scanner sc = new Scanner(System.in); //Scanner class object creation
				int choice = sc.nextInt(); //getting the choice from user
				switch(choice){
					case 1:
						System.out.println("Your searching choice is Movies by Title");
						break;
					case 2:
						System.out.println("Your searching choice is Movies by Language");
						break;
					case 3:
						System.out.println("Your searching choice Movies by Release Date");
						break;
					case 4:
						System.out.println("Your searching choice Movies by Genre");
						break;
					default:
						System.out.print("Your choice is wrong. Please enter the correct choice ");
				}
				sc.close();
	}

}
