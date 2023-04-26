package Random;

import java.io.*;

public class RandAccessCls {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Admin\\Documents\\student.txt", "rw");
		raf.writeBytes("Hi there");

		raf.seek(1);
		byte[] b = new byte[35];
		raf.read(b);
		String data = new String(b);
		System.out.println(": "+ data);

		raf.seek(7);
		raf.writeBytes("Akshat");

		 raf.seek(1);
         b = new byte[34];
         raf.read(b);
         data = new String(b);
         System.out.println("After editing: "+ data);
         
         raf.close();

	}

}
