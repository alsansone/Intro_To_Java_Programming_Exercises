/* Find the factors of an integer */
import java.util.Scanner;

public class Exercise_5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                number = number / factor;
                System.out.print(factor + " ");
            } else {
                factor++;
            }
        }
    }
}
