package Wiley_pkg_1;

public class Createclass implements Cloneable {

int  a = 10;
public void add() {
	int a= 10;
	int b= 10;
	int c=a+b;
	System.out.println("Number Adding: " + c);
}
public static void main(String args[]) throws Exception {
	//create object using new keyword
	Createclass c= new Createclass();
	c.add();
	System.out.println("create object using new keyword-\n" + c);
	
	//create object using newInstance() method
	try {
		Class cc = Class.forName("Wiley_pkg_1.Createclass");
		Createclass ci=  (Createclass) cc.newInstance();
		ci.add();
		System.out.println("create object using newInstance() method - \n"+ ci);
	} catch (ClassNotFoundException e) {
System.out.println("Exception Orrured: - " + e);		
e.printStackTrace();
	}
	// object created using Cloneable(objClone)
	Createclass objClone = (Createclass) c.clone();
	objClone.add();
	System.out.println("object created using Cloneable(objClone) \n" + objClone + "\n"+ c);
}
	}


