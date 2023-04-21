package Wiley_pkg_1;

public class Methodtyp {
	public void add(int v1, int v2)
	{
		int a = v1+v2;
		System.out.println("add: - " + a);
	}
	public static void mul(int v1, int v2)
	{
		int a = v1*v2;
		System.out.println("mul: - " + a);
	}
	public void div(int v1, int v2)
	{
		int a = v1%v2;
		System.out.println("div: - " + a);
	}
	public static void main(String[] args) {
		Methodtyp mt= new Methodtyp();	
		mul(23,45);
		mt.add(345,6789);
		mt.div(34,2);

	}

}
