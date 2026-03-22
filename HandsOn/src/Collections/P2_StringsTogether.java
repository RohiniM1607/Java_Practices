package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P2_StringsTogether {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Set<String> s = new LinkedHashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            String str = sc.nextLine();
            s.add(str);
        }

        Iterator<String> it = s.iterator();
        String result = "";

        while (it.hasNext()) {
            String word = it.next();
            System.out.println("Elements in the Set : " + word);
            result += word + " ";
        }

        System.out.println("Concatenated result: " + result.trim());
	}

}
