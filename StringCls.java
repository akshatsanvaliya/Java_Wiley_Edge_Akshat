package String;

public class StringCls {

	public static void main(String[] args) {
		String s1= "Akshat";
		String s2 = "Akshat";
		
		String s3= new String("Akshat");
		String s4 =  new String("Akshat");
		
//		System.out.println( s1 == s2);
//		System.out.println(s1==s3);
//		
//		System.out.println(s3==s4);
		String str= "Akshat";
		String str2 = " Sanvaliya";
		System.out.println("Chat at: "+ str.charAt(0));
		System.out.println("Length"+str.length());
		System.out.println("Concatenate: "+str.concat(str2));
		String str4 =str.concat(" "+str2 + " ");
		System.out.println("str4 +str4: "+str4.concat(str4));
		System.out.println("Replace: "+ str.replace("A", "K"));
		
		String str6[]= str4.split(str);
		
		for(String string: str6)
		{
			System.out.println("\nSplit: "+ string);
		}
	}

}
