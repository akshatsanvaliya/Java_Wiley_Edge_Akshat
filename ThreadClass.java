package Thread;


class Parent{
	public void m1() {
		System.out.println("This is m1.");
		
	}
	
	
	
}

class T1 extends Thread{
	public void run() {
		System.out.println("By Thread class.");
		
	}
	
	
}

class T2 extends Parent implements Runnable{
	public void run() {
		m1();
		System.out.println("Using runnable");
		
	}
}
public class ThreadClass {

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		T2 t2 = new T2();
		Thread trd = new Thread(t2);
		trd.start();
	}

}
