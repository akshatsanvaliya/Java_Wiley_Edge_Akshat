package Random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchs {

	public static void main(String[] args) {

	//	Pattern pattern = Pattern.compile("^(a|A|aa)gent \\d{3,4}$");
		Pattern pattern = Pattern.compile("\\w? \\d{3,4}$");
		Matcher matcher = pattern.matcher("Agent 007");
		Matcher matchers = pattern.matcher("00003agent 0070000");
		Matcher matcherss = pattern.matcher("aagent 007");
		Matcher matchersss = pattern.matcher("agent 007yyykjjlj");

		boolean found = matcher.find();
		boolean match = matcher.matches();
		
		boolean founds = matchers.find();
		boolean matchs = matchers.matches();
		
		boolean foundss = matcherss.find();
		boolean matchss = matcherss.matches();
		
		boolean foundsss = matchersss.find();
		boolean matchsss = matchersss.matches();
		
		System.out.println("Found: " + found);
		System.out.println("Match: " +match);

		System.out.println("\nFound: " + founds);
		System.out.println("Match: " +matchs);
		
		System.out.println("\nFound: " + foundss);
		System.out.println("Match: " +matchss);
		System.out.println("\nFound: " + foundsss);
		System.out.println("Match: " +matchsss);

	}

}