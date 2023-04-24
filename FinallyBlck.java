package Wiley_pkg_1;

public class FinallyBlck {

	public static void main(String[] args) {
try {
	System.out.println("1122334");
	
	System.out.println("Akshat");

	//System.out.println(10/0);
	System.exit(0);
	System.out.println("Sanvaliya");
}
catch (Exception e) {
		System.out.println("Catch block");
		System.out.println(10/0);
}
finally {
	System.out.println("Clone Connection");	
}
	}

}
