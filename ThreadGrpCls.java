package Thread;

class Demo implements Runnable{
	public void run() {
		System.out.println("Thread Name: "+ Thread.currentThread().getName());
	}
}
public class ThreadGrpCls {

	public static void main(String[] args) {
ThreadGroup tg = new ThreadGroup("Parent Group");
ThreadGroup tg2child= new ThreadGroup(tg, "Child Grp");
//ThreadGroup tg2child1= new ThreadGroup(tg, "Child Grp");

Thread t= new Thread(tg, new Demo(),"First");
Thread t2= new Thread(tg, new Demo(),"Second");
Thread t3= new Thread(tg2child, new Demo()," Child Third");
Thread t4= new Thread(tg, new Demo(),"Fourth");
//Thread t5= new Thread(tg2child1, new Demo(),"Fifth");
//Thread t6= new Thread(tg, new Demo(),"Sixth");

t.start();
t2.start();
t3.start();
t4.start();
//t5.start();
//t6.start();
System.out.println("Active Group of threads: "+ tg.activeCount());
System.out.println("Child group threads: "+ tg2child.activeCount());
tg.list();
	}

}
