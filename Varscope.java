package Wiley_pkg_1;

public class Varscope {
	int a=10;	
	static String name= "Akshat";
	int val = 12;
	int val1= 25;

	void add()
	{
		int val =10;
		int val1= 25;
		//	int val2= val+val1;
		//	System.out.println("Add: -" + val2);
		System.out.println("Addition: - " + (this.val+this.val1));
	}
	public static void main(String[] args) {
		int b=10;
		int val = 100;

		Varscope vs = new Varscope();
		vs.add();
		System.out.println("Declare both side: -" + val);
		System.out.println("Name: -" + name);
		System.out.println("Outside method (Global): - " + vs.a);
		System.out.println("Inside method (Local): -" + b);
	}

}
