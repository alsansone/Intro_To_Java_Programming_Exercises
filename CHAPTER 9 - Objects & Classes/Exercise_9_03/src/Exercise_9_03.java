import java.util.Date;

public class Exercise_9_03 {
    public static void main(String[] args) {

        // Date object
        Date date = new Date();
        // Loop through elapses
        for (long i = 10000; i <= 1e11; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
