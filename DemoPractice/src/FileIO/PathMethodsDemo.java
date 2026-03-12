package FileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethodsDemo {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\EXPLEO - SmartCliff_Training\\Notes\\Jenkins\\Assessment14_Input\\Program1.txt");

        // Access components of path
        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent Directory: " + path.getParent());
        System.out.println("Root: " + path.getRoot());
        System.out.println("Name Count: " + path.getNameCount());

        // Operate on path
        System.out.println("Absolute Path: " + path.toAbsolutePath());
        System.out.println("URI: " + path.toUri());

        Path pathWithDots = Paths.get("D:\\EXPLEO - SmartCliff_Training\\Notes\\Jenkins\\Assessment14_Input\\..\\Program1.txt");
        System.out.println("Normalized Path: " + pathWithDots.normalize());

        System.out.println("Subpath (0,3): " + path.subpath(0,3));

        Path base = Paths.get("D:\\EXPLEO - SmartCliff_Training\\Notes");
        Path resolvedPath = base.resolve("Jenkins\\Assessment14_Input\\Program1.txt");
        System.out.println("Resolved Path: " + resolvedPath);

        Path p1 = Paths.get("D:\\EXPLEO - SmartCliff_Training\\Notes");
        Path p2 = Paths.get("D:\\EXPLEO - SmartCliff_Training\\Notes\\Jenkins\\Assessment14_Input\\Program1.txt");
        System.out.println("Relative Path: " + p1.relativize(p2));

        // Compare paths
        System.out.println("Starts With 'D:\\EXPLEO - SmartCliff_Training'? " + path.startsWith("D:\\EXPLEO - SmartCliff_Training"));
        System.out.println("Ends With 'Program1.txt'? " + path.endsWith("Program1.txt"));

        Path anotherPath = Paths.get("D:\\EXPLEO - SmartCliff_Training\\Notes\\Jenkins\\Assessment14_Input\\Program1.txt");
        System.out.println("Paths Equal? " + path.equals(anotherPath));
	}

}
