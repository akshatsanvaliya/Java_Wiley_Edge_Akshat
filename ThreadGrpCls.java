package Thread;

class Demo implements Runnable{
	public void run() {
		System.out.println("Thread Name: "+ Thread.currentThread().getName());
	}
}
public class ThreadGrpCls {

	public static void main(String[] args) {
ThreadGroup tg = new ThreadGroup("Parent Group");
ThreadGroup tg2= new ThreadGroup(tg, "Child Grp");

Thread t= new Thread(tg, new Demo(),"First");
Thread t2= new Thread(tg, new Demo(),"Second");
Thread t3= new Thread(tg, new Demo(),"Third");

t.start();
t2.start();
t3.start();

System.out.println("Active Group of threads: "+ tg.activeCount());
	}

}
