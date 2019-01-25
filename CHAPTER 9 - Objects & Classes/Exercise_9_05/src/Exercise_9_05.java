import java.util.GregorianCalendar;

public class Exercise_9_05 {
    public static void main(String[] args) {
        // Gregorian calendar object
        GregorianCalendar calendar = new GregorianCalendar();

        // Display current date
        System.out.println("Today's date is: ");
        System.out.println(calendar.get(GregorianCalendar.MONTH) +"/" + calendar.get(GregorianCalendar.DAY_OF_MONTH) +
                "/" + calendar.get(GregorianCalendar.YEAR));

        // Set elapsed time
        calendar.setTimeInMillis(1234567898765L);
        // Display set elapsed time
        System.out.println("The elapsed time is: ");
        System.out.println(calendar.get(GregorianCalendar.MONTH) +"/" + calendar.get(GregorianCalendar.DAY_OF_MONTH) +
                "/" + calendar.get(GregorianCalendar.YEAR));

    }
}
