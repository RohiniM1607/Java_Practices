package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class P4_StudentMarkDetail {

	public static void pushAbove75(HashMap<String, Integer> studentMarks, Stack<String> stack) {
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() > 75) {
                stack.push(entry.getKey());
            }
        }
    }

    public static void popAndDisplay(Stack<String> stack) {
        System.out.println("Student Marks above 75 in the stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> studentMarks = new HashMap<>();
        Stack<String> stack = new Stack<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter student name " + i + ": ");
            String name = sc.nextLine();

            System.out.print("Enter marks of " + name + ": ");
            int marks = sc.nextInt();
            sc.nextLine();

            studentMarks.put(name, marks);
        }

        System.out.println("Student Marks in the HashMap: " + studentMarks);

        pushAbove75(studentMarks, stack);
        popAndDisplay(stack);
    }

}
