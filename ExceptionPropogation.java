package Wiley_pkg_1;

public class ExceptionPropogation {

	public static void main(String[] args) {
try {
	method1();
	
}catch (Exception e) {
	// TODO: handle exception
	System.out.println("Exception Caught: "+ e.getMessage());
}
	}

	private static void method1() throws Exception{
		// TODO Auto-generated method stub
		method2();
		
	}

	private static void method2() throws Exception {
		throw new Exception("Exception Occured in meth 2");
	}

}
