package IOStream;

import java.io.*;

public class Fstreams {

	public static void main(String[] args) throws Exception {
		FileOutputStream fo= new FileOutputStream("C:\\Users\\Admin\\Documents\\student.txt");
		String str = "I am Ironman 🫰";
		byte[] b= str.getBytes();
		fo.write(b);
		fo.flush();
		fo.close();
	}

}
