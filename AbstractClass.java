package Wiley_pkg_1;

abstract class Lol{ // must declare the class abstract in order to create abstract method
	public abstract void  m1();
		
	public void m2()
	{
		System.out.println("Inside Lol class and m2 method");
		
	}
	static {
		System.out.println("Inside Lol's abstract class's static");
	}
	public static void main(String[] args) {
		
		System.out.println("main method define insode abstract class");
	}
	public Lol() {
		System.out.println("Lol's constructor");
	}
}
 class Lol1 extends Lol{
	public void m1()
	{
		System.out.println("Inside Lol1 class which extends Lol");
	}
	public Lol1() {
		System.out.println("Lol1\'s constructor");
	}
	
	static {
		System.out.println("Inside Lol1 class's static");
	}
}
 

public class AbstractClass {

	public static void main(String[] args) {
		//Lol1 t2= new Lol1();
		Lol1 l1= new Lol1();
		l1.m1();
		l1.m2();
		Lol.main(args);
	}

}
