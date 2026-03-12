package FileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExist {

	public static void main(String[] args) {
		Path p1 = Paths.get("D:\\EXPLEO - SmartCliff_Training\\..\\Assessment14_Input\\Program2.txt");
		Path normalizedPath = p1.normalize();
		
		Path p2 = Paths.get("D:\\EXPLEO - SmartCliff_Training\\5_Jenkins_Maven\\Assessment14_Input\\Program1.txt");
		
		boolean res1 = Files.exists(p1);
		boolean res2 = Files.exists(p2);
		System.out.println(res1+" "+res2);
	}

}
