package Wiley_pkg_1;

public class Methodtyp {
	public void add(int v1, int v2)
	{
		int a = v1+v2;
		System.out.println("instance method add: - " + a);
	}
	public static int mul(int v1, int v2)
	{
		int a = v1*v2;
		//System.out.println(" static mul: - " + a);
		return a	;
	}
	public void div(int v1, int v2)
	{
		int a = v1/v2;

		System.out.println(" instance method div: - " + a);
		this.mul(v1, v2);

	}
	public static void main(String[] args) {
		Methodtyp mt= new Methodtyp();
		
		int m = mul(23,45);
		System.out.println("mul in main func: - " + m);
		mt.add(345,6789);
		mt.div(10,2);

	}

}
