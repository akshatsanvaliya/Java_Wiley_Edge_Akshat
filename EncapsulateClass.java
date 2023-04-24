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
public class EncapsulateClass {

	public static void main(String[] args) {
Employee e= new Employee();
e.setName("Akshat");
e.setAge(21);
//e.getName();
//e.getAge();
System.out.println("Employee Name: "+ e.getName()  + "\n"+ "Employee Age: "+ e.getAge());

	}

}
