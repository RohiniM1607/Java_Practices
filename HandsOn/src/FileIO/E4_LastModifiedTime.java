/*
 * The E4_LastModifiedTime class demonstrates a program
 * to get the last modified time of a specified file.
 */
package FileIO;

import java.io.File;
import java.util.Date;

public class E4_LastModifiedTime {

	public static void main(String[] args) {
		try {
			File f = new File("E1_LongestWord.txt");

			if (f.exists()) {
				long time = f.lastModified();
				Date d = new Date(time);
				System.out.println("Last modified time: " + d);
			} 
			else {
				System.out.println("File does not exist");
			}
		}
		catch (Exception e) {
			System.out.println("Error reading file");
		}
	}

}
