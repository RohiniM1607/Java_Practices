package FileIO;

import java.io.IOException;
import java.nio.file.*;

public class SoftLink {

	public static void main(String[] args) {
		Path existingFilePath = Paths.get("D:\\EXPLEO - SmartCliff_Training\\5_Jenkins_Maven\\Assessment14_Input\\Program2");
		Path symLinkPath = Paths.get("D:\\Program1.txt");
		try {
			Files.createSymbolicLink(symLinkPath, existingFilePath);
		}
		catch(IOException x) {
			System.err.print(x);
		}
		catch(UnsupportedOperationException x) {
			System.err.print(x);
		}
	}

}
