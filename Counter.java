package Wiley_pkg_1;

public class Counter {
 private static int count=0;
 private final String names;
 public Counter(String names) {
	 this.names = names;
	 
 }
 
 public synchronized void increment() {
	 count++;
 }
 
 public int getCount() {
	 return count;
 }
 
	public static void main(String[] args) {
		
	}

}
