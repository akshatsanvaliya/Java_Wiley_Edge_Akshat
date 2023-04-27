package Thread;

	class TopPriority extends Thread{
		public void run() {
			for (int i=1; i<=10; i++) {
				System.out.println(
						"Thread Name: -        " +Thread.currentThread().getName() 
						+ "\nThread Priority: =  " +Thread.currentThread().getPriority() 
						);
			}
		}
	}

public final class ThreadPriority {

	public static void main(String[] args) {
		TopPriority tp = new  TopPriority();
		TopPriority tp2 = new TopPriority();
		tp.start();
		tp2.start();
	}

}
