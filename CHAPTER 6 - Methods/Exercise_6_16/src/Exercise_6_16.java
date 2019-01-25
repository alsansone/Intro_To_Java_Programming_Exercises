/** Number of days in a year */
public class Exercise_5_16 {
    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + " has " + numberOfDaysInAYear(year) + " days");
        }
    }

    public static int numberOfDaysInAYear(int year) {

        boolean leapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

        return (leapYear ? 366 : 365);
    }
}