/*
 * The E5_ReadFileLineByLine class demonstrates a program
 * to read a file line by line and store each line into a variable.
 */
package FileIO;

import java.io.File;
import java.util.Scanner;

public class E5_ReadLineByLine {

	public static void main(String[] args) {
		try {
			File f = new File("E1_LongestWord.txt");
			Scanner sc = new Scanner(f);

			while(sc.hasNextLine()) {
				String line = sc.nextLine();   
				System.out.println(line);
			}

		}
		catch(Exception e) {
			System.out.println("Error reading file");
		}
	}

}
