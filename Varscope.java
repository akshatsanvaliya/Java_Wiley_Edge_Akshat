package Wiley_pkg_1;

public class Varscope {
	int a=10;	
	public static void main(String[] args) {
	int b=10;
	Varscope vs = new Varscope();
System.out.println("Outside method (Global): - " + vs.a);
System.out.println("Inside method (Local): -" + b);
	}

}
