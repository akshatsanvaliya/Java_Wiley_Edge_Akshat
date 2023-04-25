package String;

public class StringCls {

	public static void main(String[] args) {
		String s1= "Akshat";
		String s2 = "Akshat";
		
		String s3= new String("Akshat");
		String s4 =  new String("Akshat");
		System.out.println( s1 == s2);
		System.out.println(s1==s3);
		
		System.out.println(s3==s4);
		

	}

}
