import java.util.Scanner;

/** Convert milliseconds */
public class Exercise_6_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of milliseconds: ");
        long millis = input.nextLong();

        System.out.println(convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long hours = millis / 3_600_000;
        millis %= 3_600_000;
        long minutes = millis / 60_000;
        millis %= 60_000;
        long seconds = millis / 1000;
        millis %= 1000;

        return hours + ":" + minutes +":" + seconds;
    }
}
