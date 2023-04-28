package Thread;

class CloseEvents extends Thread{
	public void run() {
		System.out.println("Current Thread: "+ Thread.currentThread().getName());
	}
}
public class ShutdownHook {

	public static void main(String[] args) {
Runtime r = Runtime.getRuntime();
r.addShutdownHook(new CloseEvents());
	}

}
