package Wiley_pkg_1;

abstract class Lol{ // must declare the class abstract in order to create abstract method
	public abstract void  m1();
		
	public void m2()
	{
		System.out.println("Inside Lol class and m2 method");
	}public static void main(String[] args) {
		
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
	
}
 

public class AbstractClass {

	public static void main(String[] args) {
		Lol1 t2= new Lol1();
		t2.m1();
		t2.m2();
		Lol.main(args);
	}

}
