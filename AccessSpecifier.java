package Wiley_pkg_1;

class AnotherClass extends MyClass {
	public void accessMyClass() {
		MyClass myObj = new MyClass();

		myObj.publicVar = 1;
		myObj.publicMethod();

		myObj.protectedVar = 3;
		myObj.protectedMethod();
//        myObj.privateVar = 2; 
//        myObj.privateMethod();

	}
}

public class AccessSpecifier {
	public static void main(String[] args) {
		AnotherClass anotherObj = new AnotherClass();
		anotherObj.accessMyClass();
	}
}
