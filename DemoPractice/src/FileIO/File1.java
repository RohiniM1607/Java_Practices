package FileIO;

import java.nio.file.*;

public class File1 {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path p1 = fs.getPath("D:\\EXPLEO - SmartCliff_Training\\5_Jenkins_Maven\\Assessment14_Input\\Program1");
		Path p2 = p1.subpath(1, 4);
		System.out.println(p2);
	}

}
