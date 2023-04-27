package Thread;

class TopPriority extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread Name: -        " + Thread.currentThread().getName() + "\nThread Priority: =  "
					+ Thread.currentThread().getPriority()

			);
		}
	}
}

public final class ThreadPriority {

	public static void main(String[] args) {
		
		System.out.println("Main Thread: - " + Thread.currentThread().getPriority());
		TopPriority tp = new TopPriority();
		TopPriority tp2 = new TopPriority();
//		TopPriority tp3 = new TopPriority();
		tp.start();
		tp2.start();
		tp.setPriority(10);
//		tp3.start();
	}

}
