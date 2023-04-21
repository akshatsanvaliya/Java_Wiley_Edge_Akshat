package Wiley_pkg_1;

interface Person{
	public void getRole();
		
}

interface Student extends Person{}
class Teacher implements Person{
	public void getRole()
	{
		System.out.println("Teaching");
	}
	
}

class ClassRoom extends Teacher implements Student{
	public void getRole()
	{
		System.out.println("Classroom Teaching");
	}
}
public class Interface {

	public static void main(String[] args) {
		
//		 Teacher teacher = new Teacher();
//	        teacher.getRole(); 
		ClassRoom cr = new ClassRoom();
		cr.getRole(); 
	}

}
