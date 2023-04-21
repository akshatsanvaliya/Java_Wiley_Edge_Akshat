package Wiley_pkg_1;

class Test
{
	 
	 public void steering() {
		 System.out.println("steering");
	 }
}

class Test2 extends Test
{
	 public void airbag() {
		 System.out.println("airbag");
	 }
}

class Truck extends Test
{
	 public void sensor() {
		 System.out.println("sensor");
	 }
}
public class HierarchicalInherit {


		public static void main(String[] args) {
		    Test2 t2 = new Test2();
		    t2.steering();
		    t2.airbag();

		    Truck truck = new Truck();
		    truck.steering();
		    truck.sensor();
		  }			
	}


