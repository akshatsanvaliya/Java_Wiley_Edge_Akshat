package Wiley_pkg_1;

public class FinallyBlck {

	public static void main(String[] args) {
try {
	System.out.println("1122334");
	
	System.out.println("Akshat");

	System.out.println(10/0);
	//System.exit(0);
	System.out.println("Sanvaliya");
}
catch (Exception e) {
		System.out.println("Catch block");
		//System.out.println(10/0);
		try {
			System.out.println("try catch block inside try catch block" );
			System.out.println(10/0);
			
		}
		catch (Exception ee) {
System.err.println(ee);		}
}
finally {
	//System.out.println(10/0);
	System.out.println("Clone Connection");	
}
	}

}