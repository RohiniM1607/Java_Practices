/*
 * The E1_LongestWord class demonstrates a simple File I/O program
 * that reads a text file and finds the longest word present in the file.
 */

package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E1_LongestWord {

	public static void main(String[] args) throws Exception{
		try {
			File f = new File("E1_LongestWord.txt");
		     Scanner sc = new Scanner(f);
		     String longest = "";

		     while(sc.hasNext()) {
		    	 String word = sc.next();
		         if(word.length() > longest.length()) {
		        	 longest = word;
		         }
		     }
		     System.out.println("Longest word: " + longest);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		 
	}

}
