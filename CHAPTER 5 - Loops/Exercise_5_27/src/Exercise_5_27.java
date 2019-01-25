/** Display leap years */
public class Exercise_5_27 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 101; i <= 2100; i++) {
            boolean leapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
            if (leapYear) {
                count++;
                System.out.print(i + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n\nThe number of leap years between 101 and 2100 is " + count);
    }
}
