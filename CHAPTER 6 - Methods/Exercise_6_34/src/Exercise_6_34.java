import java.util.Scanner;

/** Print calendar */
public class Exercise_6_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month from 1 to 12: ");
        int month = input.nextInt();

        printFullCalendar(year, month);

    }

    public static void printFullCalendar(int year, int month) {
        printCalendarTitle(year, month);
        printCalendarBody(year, month);
    }

    public static void printCalendarTitle(int year, int month) {
        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printCalendarBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getDaysInAMonth(year, month);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int j = 1; j <= numberOfDaysInMonth; j++) {
            if (j < 10) {
                System.out.print("   " + j);
            } else {
                System.out.print("  " + j);
            }
            if ((j + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static int getStartDay(int year, int month) {
        return getDayOfTheWeek(year, month, 1);
    }

    public static int getDayOfTheWeek(int year, int month, int dayOfMonth) {
        if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }

        int century = year / 100;
        int yearOfCentury = year % 100;
        int h = (dayOfMonth + 26 * (month + 1) / 10 + yearOfCentury + (yearOfCentury / 4) + (century / 4) +
                (5 * century)) % 7;
        return (h + 6) % 7;
    }

    public static int getDaysInAMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }
        return monthName;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
