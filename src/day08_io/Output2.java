package day08_io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Output2 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os =new FileOutputStream("C:\\Users\\ko90k\\OneDrive\\바탕 화면\\abc.txt");
		byte[] data = "A".getBytes()	;
		os.write(data);
		os.flush();

		
	//447
	}
	
	

}
