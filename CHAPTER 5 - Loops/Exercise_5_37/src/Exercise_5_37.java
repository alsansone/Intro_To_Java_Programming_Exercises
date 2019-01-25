import java.util.Scanner;
/** Decimal to binary */
public class Exercise_5_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        String binary = " ";

        for (int i = number; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }
        System.out.println("The binary conversion of " + number + " is " + binary);
    }
}
