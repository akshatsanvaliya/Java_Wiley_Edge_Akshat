package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Test extends Thread {
	public void run() {
		System.out.println("Thread name: -" + Thread.currentThread().getName());

	}
}

public class ThreadPool {

	public static void main(String[] args) {
ExecutorService es = Executors.newFixedThreadPool(1);
//		ExecutorService es = Executors.newCachedThreadPool();
//for (int i =1; i<=1000000; i++) {
	es.execute(new Test());

//}
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);
//		ex.schedule(new Test()	, 3, TimeUnit.SECONDS);
		//ex.scheduleAtFixedRate(new Test(), 10, 2, TimeUnit.SECONDS);

es.shutdown();
	}

}
