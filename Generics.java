package Genrics;

import java.security.PublicKey;
import java.util.ArrayList;

public class Generics {
	
	private static <T> T shout(T shoutOUT) {
		
		System.out.println(shoutOUT + "...!!!!");
		return shoutOUT;
}

	public static void main(String[] args) {

//		Printer<Cat> printer = new Printer(new Cat());
//		printer.print();
//		Printer<Dog> printer1 = new Printer(new Dog());
//		printer1.print();
//		
//		
//		ArrayList<Object> cats = new ArrayList<>();
//		cats.add(new Cat());
//		cats.add(new Cat());
//		cats.add(new Dog());
		
		
		shout("Take me to movie");
		shout("HEY");
		shout("HOOT HOOT");
		shout(3000000);
		shout(new Dog());
		
	}

}
