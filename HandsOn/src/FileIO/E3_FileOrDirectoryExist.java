/*
 * The E3_CheckFileOrDirectory class demonstrates a program
 * to check whether a file or directory specified by a pathname exists.
 */
package FileIO;

import java.io.File;

public class E3_FileOrDirectoryExist {

	public static void main(String[] args) {
		try {
			File f = new File("D:\\EXPLEO - SmartCliff_Training\\Git\\Git and GitHub with eclipse\\JavaPractices\\HandsOn");

			if (f.exists()) {
				System.out.println("File or Directory exists");
			} 
			else {
				System.out.println("File or Directory does not exist");
			}
		}
		catch (Exception e) {
			System.out.println("Error checking the path");
		}
	}

}
