package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test extends Thread{
public void run() {
	System.out.println("Thread name: -"+ Thread.currentThread().getName());
	
}
}
public class ThreadPool {

	public static void main(String[] args) {
ExecutorService es = Executors.newFixedThreadPool(4);
for (int i =1; i<=1000; i++) {
	es.execute(new Test());
}
	}

}
