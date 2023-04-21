package Wiley_pkg_1;

public class Instanceorder {
	String name ;
	int age;
	{
		name = "Akshat";
		age = 21;
		System.out.println("instance block");
	}
		
	public Instanceorder() {
		System.out.println("from class: - " + (this.age + this.name));
		System.out.println("Construcor block");
}
	public Instanceorder(int a, int b) {
		System.out.println("Construcor block param: - " + (a+b));
}
	public static void main(String args[]) {
		Instanceorder io= new Instanceorder();
		new Instanceorder(2,3);
	}
}
