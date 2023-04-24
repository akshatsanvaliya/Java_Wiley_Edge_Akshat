package Wiley_pkg_1;

abstract class Lol{ // must declare the class abstract in order to create abstract method
	public abstract void  m1();
		
	public void m2()
	{
		System.out.println("Inside Test class and m2 method");
	}
	
}
 class Lol1 extends Lol{
		@Override
	public void m1()
	{
		System.out.println("Inside Test class and m2 method");
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		Lol1 t2= new Lol1();
		t2.m1();
		t2.m2();
	}

}
