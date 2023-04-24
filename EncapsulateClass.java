package Wiley_pkg_1;
class Employee{
	private String Name;
	private int age;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name= Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

 class EmployeeImpl{
	public void show(Employee e) {
		//System.out.println("Inside show method: "+ e);
		System.out.println("Calling from different class:  ");
		System.out.println("Employee Name: "+ e.getName()  + "\n"+ "Employee Age: "+ e.getAge());

	}
}
public class EncapsulateClass {

	public static void main(String[] args) {
Employee e= new Employee();
e.setName("Akshat");
e.setAge(21);
//e.getName();
//e.getAge();
EmployeeImpl el= new EmployeeImpl();
el.show(e);
System.out.println("\nCalling form main class's method:  ");
System.out.println("Employee Name: "+ e.getName()  + "\n"+ "Employee Age: "+ e.getAge());

	}

}
