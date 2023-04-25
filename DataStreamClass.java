package IOStream;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamClass {

	public static void main(String[] args) throws Exception{
		FileOutputStream fs = new  FileOutputStream("C:\\Users\\Admin\\Documents\\test1.txt");
		DataOutputStream df = new  DataOutputStream(fs);
		df.writeBytes("I am Ironman🫰");
		df.flush();
		df.close();
	}

}
