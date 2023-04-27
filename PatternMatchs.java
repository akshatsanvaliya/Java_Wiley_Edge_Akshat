package Random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchs {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("agent {3,4}");
		Matcher matcher = pattern.matcher("agent 007");
		boolean found = matcher.find();
		boolean match = matcher.matches();
		System.out.println("Found: " + found);
		System.out.println("Match: " +match);
	}

}