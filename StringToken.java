package String;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		
		String input = "Hey there, How's the day goin!";
		StringTokenizer st = new StringTokenizer(input, ",");
		
		System.out.println("count tokens:"+ st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.println("Inside while:"+st.nextToken().trim());
			
		}
		//System.out.println(st.nextToken());
	}

}
