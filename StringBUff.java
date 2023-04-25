package String;

public class StringBUff {

	public static void main(String[] args) {
StringBuffer sb= new StringBuffer("Akshat");
StringBuffer sb1= new StringBuffer("Akshat");
StringBuffer sb2= new StringBuffer("Akshat");
StringBuilder bs = new StringBuilder("Sanvaliya");
System.out.println("String Builder: "+bs.reverse());


String sbs= "Akshat";
String sbc= "Akshat";


System.out.println("Comparing String Buffer to String Buffer"+ sb.equals(sb2));
System.out.println("Comparing String to String Buffer: "+sbs.equals(sb2.toString()));
System.out.println("Comparing String Buffer to String Buffer using .toString(): "+sb.equals(sb2.toString()));

System.out.println(sb.append(" Sanvaliya"));

System.out.println(sb);

System.out.println(sb.insert(16, "D"));
System.out.println("Delete: "+sb.delete(0, 5));
System.out.println("Reverse: "+sb1.reverse());


	}

}
