import java.util.Scanner;

public class Exercise_5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int startDay = input.nextInt();

        int numberOfDaysInMonth = 0;
        String monthName = " ";

        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1:
                    monthName = "January";
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                    numberOfDaysInMonth = (leapYear ? 29 : 28);
                    break;
                case 3:
                    monthName = "March";
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    numberOfDaysInMonth = 31;
                    break;
            }
            // Print header
            System.out.println("         " + monthName + " " + year);
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            for (int j = 0; j < startDay; j++) {
                System.out.print("    ");
            }

            for (int days = 1; days <= numberOfDaysInMonth; days++) {
                System.out.printf("%4d", days);

                if ((days + startDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            startDay = (startDay + numberOfDaysInMonth) % 7;
        }
    }
}
