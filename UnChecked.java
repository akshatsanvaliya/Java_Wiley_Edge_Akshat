package Wiley_pkg_1;

import java.util.ArrayList;

class StringNotFound extends RuntimeException {
	public StringNotFound(String message) {
		super(message);
	}
}

public class UnChecked {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();
		students.add("Akshat");
		students.add("Selena");
		students.add("Bro");

		if (!students.contains("")) {
			try {
				throw new StringNotFound("This string not found");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("message One");
		System.out.println("Message two");
	}

}
