import java.util.Scanner;

public class Exercise_6_02 {
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        long integer = input.nextLong();
        // Display results of method
        System.out.println("The sum of the digits is " + sumDigits(integer));
    }

    public static long sumDigits(long n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
