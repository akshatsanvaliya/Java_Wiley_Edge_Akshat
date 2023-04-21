package Wiley_pkg_1;

class Avengers
{
	public void Superhero()
	{
		System.out.println("Superhero");
	}
}

class Ironman extends Avengers
{
	public void Iron()
	{
		System.out.println("I am Ironman🫰");
	}
}

class Hulk extends Avengers
{
	public void Hul()
	{
		System.out.println("I am Hulk🦸‍♂️");
	}
}

class Spiderman extends Hulk     
{
	public void Spidey()
	{
		System.out.println("I am Spiderman🕸️");
	}
}

class Black_Wid extends Ironman
{
	public void Ironman()
	{
		System.out.println("I am Black Widow🕷️");
	}
}

public class MultiLevelInherit {
	
	public static void main(String[] args) {
		Spiderman spidey = new Spiderman();
		spidey.Hul(); 
		spidey.Spidey();
		spidey.Superhero(); 
		
		Black_Wid widow = new Black_Wid();
		widow.Superhero(); 
		widow.Iron(); 
		widow.Ironman();
	}
}
