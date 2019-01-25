import java.util.Scanner;
/** Decimal to octal */
public class Exercise_5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        String octal = "";

        int value = number;
        while (value != 0) {
            octal = (value % 8) + octal;
            value = value / 8;
        }
        System.out.println("The octal conversion of " + number + " is " + octal);
    }
}
