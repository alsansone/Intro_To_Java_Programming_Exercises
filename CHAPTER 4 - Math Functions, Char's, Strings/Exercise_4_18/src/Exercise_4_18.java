import java.util.Scanner;

public class Exercise_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String majorStatus = input.nextLine();

        if (majorStatus.startsWith("M")) {
            System.out.print("Mathematics ");
        } else if (majorStatus.startsWith("C")) {
            System.out.print("Computer Science ");
        } else if (majorStatus.startsWith("I")) {
            System.out.print("Information Technology ");
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }

        if (majorStatus.endsWith("1")) {
            System.out.print("Freshman");
        } else if (majorStatus.endsWith("2")) {
            System.out.print("Sophomore");
        } else if (majorStatus.endsWith("3")) {
            System.out.println("Junior");
        } else if (majorStatus.endsWith("4")) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }
}
