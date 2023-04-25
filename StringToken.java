package String;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hey There!");
		
		System.out.println("count tokens: "+ st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.println("Inside while: "+st.nextToken());
			
		}
		//System.out.println(st.nextToken());
	}

}
