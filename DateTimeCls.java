package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeCls {

    public static void main(String[] args) {
        // Current date
        LocalDate myDate = LocalDate.now();

        System.out.println(myDate);

        // Current time
        LocalTime apnatime = LocalTime.now();

        System.out.println(apnatime);

        // Current date and time
        LocalDateTime apnadatetime = LocalDateTime.now();

        System.out.println("Before Formatting: " + apnadatetime);

        // Format: yyyy-MM-dd
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate1 = myDate.format(format1);
        System.out.println("YYY-MM-dd: " + formattedDate1);

        // Format: dd/MM/yyyy
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate2 = myDate.format(format2);
        System.out.println("dd/MM/yyyy: " + formattedDate2);

        // Format: dd-MMM-yyyy
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate3 = myDate.format(format3);
        System.out.println("dd-MMM-yyyy: " + formattedDate3);

        // Format: E, MMM dd yyyy
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDate4 = myDate.format(format4);
        System.out.println("E,MMM dd yyyy: " + formattedDate4);

        // Format: hh:mm:ss a
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = apnatime.format(format5);
        System.out.println("Formatted Time: " + formattedTime);
    }
}
