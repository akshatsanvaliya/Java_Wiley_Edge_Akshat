package Wiley_pkg_1;

public class Createclass {

int  a = 10;
public void add() {
	System.out.println("Number Adding: ");
}
public static void main(String args[]) throws Exception {
	Createclass c= new Createclass();
	c.add();
	System.out.println("Object: -" + c);
	try {
		Class cc = Class.forName("Wiley_pkg_1.Createclass");
		Createclass ci=  (Createclass) cc.newInstance();
		ci.add();
		System.out.println("Inside Createclass Class: - "+ ci);
	} catch (ClassNotFoundException e) {
System.out.println("Exception Orrured: - " + e);		
e.printStackTrace();
	}
}
	}


