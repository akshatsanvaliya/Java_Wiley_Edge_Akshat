package IOStream;

import java.io.BufferedOutputStream;

public class BOStream {

	public static void main(String[] args) {
BufferedOutputStream bof = new BufferedOutputStream(System.out);
String str = "I am Iron man 🫰";
byte[] b = str.getBytes();
try {
	bof.write(b);
	//bof.flush();
	bof.close();
}
catch (Exception e) {
	System.out.println(e);
}
	}

}
