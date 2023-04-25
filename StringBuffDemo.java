package String;

public class StringBuffDemo {

	public static void main(String[] args) {
StringBuffer chatHistory = new StringBuffer();
String sender= "Akshat";
String message= "Hey Selena!";
System.out.println(chatHistory.append(sender + ": "+ message + "\n"));
sender = "Selena";
message = "Hi Akshat!";
System.out.println(chatHistory.append(sender + ": "+ message + "\n"));

	}

}
