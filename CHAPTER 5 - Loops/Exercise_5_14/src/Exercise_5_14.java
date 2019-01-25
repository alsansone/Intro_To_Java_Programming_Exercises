/*Compute the greatest common divisor*/
import java.util.Scanner;

public class Exercise_5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        // initialize d as the minimum of n1 & n2
        int d = (n1 < n2) ? n1 : n2;
        // check for greatest common divisor
        for (; d >= 1; d--) {
            if (n1 % d == 0 && n2 % d == 0) {
                break;
            }
        }
        System.out.println("The greatest common divisor is " + d);
    }
}
