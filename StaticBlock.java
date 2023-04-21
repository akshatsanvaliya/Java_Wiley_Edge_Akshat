package Wiley_pkg_1;

public class StaticBlock {
	
	static {
		System.out.println("Inside Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public StaticBlock() {
		System.out.println("Inside COnstructor Block");
	}
	public static void main(String[] args) {
		
		StaticBlock sb= new StaticBlock();
		
		System.out.println("Object Address: -  "+ sb);
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
		System.out.println("Object Address: -  "+ sb);

		

	}

}
