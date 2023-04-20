
public class Type_Casting {

	public static void main(String[] args) {
//Wide Casting "byte -> short -> char -> int -> long -> float -> double"
		System.out.println("Wide Casting: -\n");

		byte b=7;
short s = b;
char c= (char) b;
int i= c;
long l= i;
float f= l;
double d= f;

System.out.println("Byte: " + b+ "\n short" +s +"\nCharacter" + c +"\nInteger" + i +"\nLong" + l +"\nFloat" +  f +"\n Double: " + d);

//Narrowing Casting: - double -> float -> long -> int -> char -> short -> byte
System.out.println("\nNarrowing Casting: -\n");
 double dd = 2.9;
 float ff =  (float) dd;
 long ll = (long) ff;
int ii = (int) ll;
char cc= (char) ii;
short ss= (short) cc;
byte bb= (byte) ss;
System.out.println("Double: " + dd+ "\n float" +ff +"\nlong" + ll +"\nInteger" + i +"\nChar" + cc +"\nShort " +  ss +"\n byte: " + bb);
 
//String to Integer: - 
String Abs= "123";
int newInt = Integer.parseInt(Abs);
System.out.println(Abs + newInt);
	}

}
