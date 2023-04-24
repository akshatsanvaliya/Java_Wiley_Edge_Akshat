package Wiley_pkg_1;
import java.lang.*;
public class ExceptionHandle extends Throwable {

	public static void main(String[] args) {
System.out.println("First Statement");
int arr[]= {1,2,3,4};

try {
	System.out.println(arr[1]);
	System.out.println(arr[47]);	
}
catch (Exception e) {
	System.out.println("Exception is: "+e);
	System.out.println(e.getMessage());
	System.out.println(e.toString());
	e.printStackTrace();
}
System.out.println("another statem");

	}

}
