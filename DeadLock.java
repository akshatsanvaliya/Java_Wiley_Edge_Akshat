package Thread;

public class DeadLock {

	public static Object Lock1= new Object();
	public static Object Lock2= new Object();
	
	
	private static class LockThread extends Thread{
		public void run() {
			
			synchronized (Lock1) {
			
				System.out.println("Thread one hold:  ");
				try {
					Thread.sleep(100);
				}catch (Exception e) {
					System.out.println(e);
				}
			}
			System.out.println("Thread 1 is waiting for lock2");
			synchronized (Lock2) {
			System.out.println("Thread one hold: Lock 2");
			
			
				
				
			}
		}
	}
	public static void main(String[] args) {
			LockThread lt = new LockThread();
			lt.start();
	}

}
