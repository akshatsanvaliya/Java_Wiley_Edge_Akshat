package Thread;


class  Sheet{
	public  synchronized void writeLn(int k) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(i*k);
		}
		
	}
}


class Person1 extends Thread{
	Sheet s1;
	public Person1(Sheet s1){
		super();
		this.s1 = s1;
		
		
	}
	
	public void run() {
		System.out.println("Person1");
		s1.writeLn(5);
		
	}
	
}


class Person2 extends Thread{
	Sheet s1;
	public Person2(Sheet s1){
		super();
		this.s1 = s1;
		
		
	}
	
	public void run() {
		s1.writeLn(5);
		System.out.println("Person2");

		
	}
	
}
public class SyncThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheet s1 = new Sheet();
		
		Person1 p1 = new Person1(s1);
		Person2 p2 = new Person2(s1);
		p1.start();
		p2.start();
	
	}

}
