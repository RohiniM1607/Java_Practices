package FileIO;

import java.nio.file.*;

public class PathMethod {

	public static void main(String[] args) {
		Path p1 = Paths.get("D:\\EXPLEO - SmartCliff_Training\\..\\Assessment14_Input\\Program2.txt");
		Path normalizedPath = p1.normalize();
		
		Path p2 = Paths.get("D:\\EXPLEO - SmartCliff_Training\\5_Jenkins_Maven\\Assessment14_Input\\Program1.txt");
		
		System.out.println("Normalized Path: "+normalizedPath);
		Path subPath = p1.subpath(1, 3);
		System.out.println("SubPath: "+subPath);
		System.out.println("getFileName: "+p1.getFileName());
		System.out.println("getParent: "+p1.getParent());
		System.out.println("getNameCount: "+p1.getNameCount());
		System.out.println("getRoot: "+p1.getRoot());
		System.out.println("isAbsoulte: "+p1.isAbsolute());
		System.out.println("toAbsolute: "+p1.toAbsolutePath());
		System.out.println("toURL: "+p1.toUri());
		if(p1.equals(p2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		
	}

}
