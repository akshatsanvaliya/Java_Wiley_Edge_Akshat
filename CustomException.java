package Wiley_pkg_1;

class AgeNotValid extends Exception{
	public AgeNotValid(String message) {
		super(message);
	}
	public String getMessage() {
		return "this age is not valid";
	}
	public String toString() {
		return "age not applicable";
	}
}
public class CustomException {
	public static void getAge(int age) throws AgeNotValid {
			if(age > 18) {
				try {
				throw new AgeNotValid("Age is not valid");
			}
			catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			}
			}
			else {
				System.out.println("Age Valid");
			}
}

	public static void main(String[] args) throws AgeNotValid {
		getAge(67);

	}

}
