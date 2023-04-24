package Wiley_pkg_1;

abstract class Vehiclees{
	protected String color;
	protected int speed;
	protected int wheels;
	public Vehiclees(String color, int speed, int wheels) {
		this.color= color;
		this.speed= speed;
		this.wheels= wheels;
		System.out.println("Inside abstract clas Vehicles, ");
	}
	public abstract void move();
	
	
}

class Carss extends Vehiclees{
	public Carss(String color, int speed, int wheels) {
		super(color,speed,wheels);
		
	}
	public void move() {
		
	}
	public void turn() {
		System.out.println("Turning Left or right....");
	}
}
public class CarAbstract {

	public static void main(String[] args) {
		Carss ca= new Carss("Red", 20, 4);

	}

}
