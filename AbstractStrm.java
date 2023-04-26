package IOStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;

import javax.print.DocFlavor.INPUT_STREAM;

public class AbstractStrm {

	
	public static void main(String[] args) throws Exception {

		OutputStream fo= new FileOutputStream("C:\\Users\\Admin\\Documents\\student.txt");
		String str = "I am Ironman 🫰";
		byte[] b= str.getBytes();
	
		fo.write(b);
		fo.flush();
		fo.close();
		
	}
		
		
		
//		InputStream foo = new FileInputStream("C:\\Users\\Admin\\Documents\\student.txt");
//
//		int i = 0;
//		while ((i = foo.read()) != -1) {
//			System.out.println((char) i);
//		}
//		foo.close();

	}


