package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class P3_CharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text:");
        String text = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('a', 0);
        map.put('c', 0);
        map.put('o', 0);
        map.put('s', 0);

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
        }

        System.out.println("Character counts:");
        System.out.println("a: " + map.get('a'));
        System.out.println("c: " + map.get('c'));
        System.out.println("s: " + map.get('s'));
        System.out.println("o: " + map.get('o'));
	}

}
