package day08_io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Output {
	public static void main(String[] args) throws Exception {
		//   파일위치 \\두개 !!
		OutputStream os =new FileOutputStream("C:\\Users\\ko90k\\OneDrive\\바탕 화면\\abc.txt");
		byte[] data = "ABC".getBytes()	;
//		for(int i =0;i<data.length;i++) {
		os.write(data[0]);
//		}
		
		
	}

}
