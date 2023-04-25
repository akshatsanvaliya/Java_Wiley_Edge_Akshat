package String;

public class StringBuildCls {

	public static void main(String[] args) {
//StringBuilder bs= new StringBuilder("Akshat");
//		bs.append(" Sanvaliya");
		// "[Time_Stamp user: userId,logged in Successfully ]";

		StringBuilder logMsg = new StringBuilder();
		long timestamp = System.currentTimeMillis();
		logMsg.append("[ " + timestamp + " ]");

		int userId = 12356;
		logMsg.append("User: " + userId);
		String message = " Login Successfully";
		logMsg.append(message);
		System.out.println(logMsg.toString());
	}

}
