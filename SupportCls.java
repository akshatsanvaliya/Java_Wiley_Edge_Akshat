package Thread;


class Daemon extends Thread{
	@Override
	public void run() {
if(Thread.currentThread().isDaemon()) {		
	
	System.out.println("This is Daemon");

}else {
	System.out.println("Not a daemon class");
}
	}
}
public class SupportCls {

	public static void main(String[] args) {
		Daemon sc = new Daemon();
		Daemon sc2 = new Daemon();
		sc.setDaemon(true);
		sc.start();
		sc2.start();
	}

}
