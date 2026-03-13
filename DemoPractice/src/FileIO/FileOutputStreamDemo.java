package FileIO;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String data = "Welcome to Java Portal!!! Have a happy learning";
		
		try {
			FileOutputStream output = new FileOutputStream("Output.txt");
			
			byte[] array = data.getBytes();
			output.write(array);
			System.out.println("Successfully done. Check the file");
			output.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}