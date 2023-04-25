package String;

import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {

String title = "Java Dev";
float salary = 2000.36f;
//System.out.format("%s has %.2f USD salary", title, salary);

List<String> techstack = Arrays.asList(
		"Java in 10 days",
		"Java for Begineers",
		"Java in 2 mins");

for (String book:techstack) {
	System.out.format("%-30s - In Stock \n", book);
}
	}

}
