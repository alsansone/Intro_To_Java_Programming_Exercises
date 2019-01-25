import java.util.Scanner;

public class Exercise_4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        int days = 0;
        //boolean leapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        if (month.startsWith("Jan") || month.startsWith("Mar") || month.startsWith("May") ||
                month.startsWith("Jul") || month.startsWith("Aug") || month.startsWith("Oct") ||
                month.startsWith("Dec")) {
            days = 31;
        } else if (month.startsWith("Apr") || month.startsWith("Jun") || month.startsWith("Sep") ||
                month.startsWith("Nov")) {
            days = 30;
        } else if (month.startsWith("Feb")) {
            boolean leapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            days = (leapYear ? 29 : 28);
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }
        System.out.println(month.substring(0, 3) + " " + year + " has " + days + " days");
    }
}