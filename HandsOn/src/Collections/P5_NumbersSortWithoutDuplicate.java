package Collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class P5_NumbersSortWithoutDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            int num = Integer.parseInt(input);
            numbers.add(num);
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
        } else {
            ArrayList<Integer> oddNumbers = new ArrayList<>();

            for (int num : numbers) {
                sum += num;
                if (num % 2 != 0) {
                    oddNumbers.add(num);
                }
            }

            double average = (double) sum / numbers.size();

            System.out.println("Sorted unique numbers: " + numbers);
            System.out.println("Average: " + average);
            System.out.println("Lowest: " + numbers.first());
            System.out.println("Highest: " + numbers.last());
            System.out.println("Odd numbers: " + oddNumbers);
        }
	}

}
