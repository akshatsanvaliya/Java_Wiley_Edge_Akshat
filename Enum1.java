enum week{
	Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
}
public class Enum1 {
	public static void main(String args[])
	{
week[] days = week.values();
        
        for(int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
	}
}
