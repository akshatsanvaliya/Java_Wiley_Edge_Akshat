package Random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
String input = "Hi there How are you, I am bored btw";
Pattern p = Pattern.compile("How");
Matcher m = p.matcher(input);
if (m.find()) {
	int start = m.start();
	int end = m.end();
	
	System.out.println("Found from index "+ start+ " to "+ (end-1));
}
	}

}
