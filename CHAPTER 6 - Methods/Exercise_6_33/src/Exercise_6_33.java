/** Current date and time */
public class Exercise_6_33 {
    public static void main(String[] args) {
        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis / 1000;
        int currentSeconds = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int currentMinutes = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        int currentHours = (int)(totalHours % 24);

        int totalDays = (int)(totalHours / 24);
        if (currentHours > 0)
            totalDays++;

        // Get current year
        int currentYear = 2018;
        do {
            currentYear++;
        } while (totalDaysInYears(currentYear) < totalDays);

        // Get current month
        int totalNumDaysInTheYear = totalDays - totalDaysInYears(currentYear - 1);
        int currentMonth = 0;
        do {
            currentMonth++;
        } while (totalDaysInMonths(currentYear, currentMonth) < totalNumDaysInTheYear);

        // Get current day
        int currentDay = totalNumDaysInTheYear - totalDaysInMonths(currentYear, currentMonth - 1);

        System.out.println("Current date and time is " + getMonthName(currentMonth) + " " + currentDay +
                ", " + currentYear + " " + currentHours + ":" +
                (currentMinutes < 10 ? "0" + currentMinutes : currentMinutes) +
                ":" + (currentSeconds < 10 ? "0" + currentSeconds : currentSeconds) + " GMT");

    }

    public static int totalDaysInMonths(int year, int month) {
        int total = 0;

        for (int i = 1; i <= month; i++) {
            total += getNumDaysInMonth(year, i);
        }
        return total;
    }

    public static int totalDaysInYears(int year) {
        int total = 0;

        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        return total;
    }

    public static int getNumDaysInMonth(int year, int month) {
        if (month == 1 || month==3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            if (isLeapYear(year))
                return 29;
            else
                return 28;

        return 0;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
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
}
