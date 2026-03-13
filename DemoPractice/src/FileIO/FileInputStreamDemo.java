package FileIO;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("Input.txt");
			System.out.println("Data in te file:");
			int i = input.read();
			while(i!=-1) {
				System.out.print((char)i);
				i = input.read();
			}
			input.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
