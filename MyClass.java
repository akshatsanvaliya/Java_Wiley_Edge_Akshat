package Wiley_pkg_1;

public class MyClass {
	public int publicVar; // Public variable
	private int privateVar; // Private variable
	protected int protectedVar; // Protected variable

	public void publicMethod() {
		System.err.println("inside Public method");
	}

	private void privateMethod() {
		System.err.println("inside private");
	}

	protected void protectedMethod() {
		System.err.println("inside protected");
	}
}
