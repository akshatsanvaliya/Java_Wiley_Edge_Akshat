package IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BOStream {

	public static void main(String[] args)  {
//		FileOutputStream fs = new FileOutputStream("C:\\Users\\Admin\\Documents\\test.txt");
//		BufferedOutputStream bof = new BufferedOutputStream(fs);
//		String str = "I am Spider Man";
//		byte[] b = str.getBytes();
//		try {
//			bof.write(b);
//			bof.flush();
//			bof.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		try {
		FileInputStream fs = new  FileInputStream("C:\\Users\\Admin\\Documents\\test.txt");
		BufferedInputStream bis = new BufferedInputStream(fs);
		
	
		int i;
		while((i= bis.read()) !=-1) {
			System.out.println((char)i);
		}
		
		bis.close();
		fs.close();
		}catch (Exception e) {
System.out.println(e);		}
	}

}
