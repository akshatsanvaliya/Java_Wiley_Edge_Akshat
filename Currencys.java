package Random;
import java.text.NumberFormat;
import java.util.*;

public class Currencys {

	public static void main(String[] args) {
			Currency usd =  Currency.getInstance("USD");
			NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
			String formattedval = format.format(108.5);
			System.out.println(formattedval);
	}

}
