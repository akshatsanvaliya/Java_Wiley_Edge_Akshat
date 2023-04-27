package Thread;

class TopPriority extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread Name: -   " + Thread.currentThread().getName() + "\nThread Priority: =  "
					+ Thread.currentThread().getPriority()

			);
		}
	}
}

public final class ThreadPriority {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Main Thread: - " + Thread.currentThread().getPriority());
		TopPriority tp = new TopPriority();
		TopPriority tp2 = new TopPriority();
		TopPriority tp3 = new TopPriority();
		tp.start();
		tp.join(5000);
		System.out.println(tp.getState());
		tp2.start();
		tp2.join(5000);
		System.out.println(tp2.getState());
		tp3.start();
		tp3.join(5000);
		
	}

}
