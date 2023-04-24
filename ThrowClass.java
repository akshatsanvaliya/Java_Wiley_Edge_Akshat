package Wiley_pkg_1;

public class ThrowClass {
	
	public static void m1() throws InterruptedException{
		try {
			m2();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
public static void m2() throws InterruptedException{
	Thread t = new Thread();
	t.sleep(1000);
}
	public static void main(String[] args) throws InterruptedException {
		m1();
	}

}
