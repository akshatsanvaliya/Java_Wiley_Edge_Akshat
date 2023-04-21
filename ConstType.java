package Wiley_pkg_1;

public class ConstType {
	public ConstType(int a , int b)
	{
		System.out.println(" two arg in constr.: " + (a+b));
	}
	
	public ConstType(double a , int b)
	{
		System.out.println(" two arg in constr. but with different DT: " + (a+b));
	}
	
	public ConstType() {
System.out.println("no args: -");
}

	public void add()
	{
		
	}

	public static void main(String[] args) {

		ConstType stnoparam= new ConstType();
		ConstType st2param= new ConstType(2,3);
		ConstType st2paramwithdifDT= new ConstType(2.4,5);


	}

}
