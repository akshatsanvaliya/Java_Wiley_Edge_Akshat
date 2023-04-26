package IOStream;

import java.io.*;

public class CharStreamsss {

	
	public static void main(String[] args) throws Exception {
//		Writer out = new OutputStreamWriter(System.out);
//		Writer fw = new FileWriter("C:\\Users\\Admin\\Documents\\student.txt");
//		BufferedWriter bw= new BufferedWriter(fw);
//		bw.write("I am Ironman 🫰");
//		
//		bw.flush();
//		bw.close();
//		fw.close();
		
		
		Reader out = new InputStreamReader(System.in);
		Reader fw = new FileReader("C:\\Users\\Admin\\Documents\\student.txt");
		BufferedReader bw= new BufferedReader(fw);
		
		int i = 0;
		while ((i = bw.read()) != -1) {
			System.out.println((char) i);
		}
		bw.close();
		fw.close();
	}

}
