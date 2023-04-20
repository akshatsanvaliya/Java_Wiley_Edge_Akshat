import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int number;
do
{
	System.out.println("Enter the muber b/w 1-10: ");
	number= sc.nextInt();
}while(number < 1 || number > 10);
{
	System.out.println("Number is: " + number);
}
	}

}
