package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOStream {

	public static void main(String[] args) {
		byte[] b = new byte[128];
		try(FileInputStream fis = new FileInputStream("Input.txt");
				FileOutputStream fos = new FileOutputStream("Output.txt")) {
			System.out.println("Bytes available: "+fis.available());
			int count = 0;     //for single character count 1 byte, for new line character count 2 byte
			int read = 0;
			while((read= fis.read(b))!=-1) {
				fos.write(b);
				count+=read;
			}
			System.out.println("Total cout: "+count);
			
		}catch(FileNotFoundException f) {
			System.out.println("File not found: "+f);
		}catch(IOException e) {
			System.out.println("IOException: "+e);
		}
	}

}
