package Random;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskingCredCardMask {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Card Number: ");
			String cardNum = sc.nextLine().trim(); 
			
			
			StringBuilder sb = new StringBuilder();
            int len = cardNum.length();
            for (int i = 0; i < len; i++) {
                if (i > 0 && i % 4 == 0) {
                    sb.append("-");
                }
                sb.append(cardNum.charAt(i));
            }
            
			Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
			Matcher matcher= pattern.matcher(cardNum);
			String maskedCard = matcher.replaceAll("xxxx-xxxx-xxxx-");
			System.out.println(maskedCard);
		}
			
			
	}

}
