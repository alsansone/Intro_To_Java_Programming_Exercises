import java.util.Scanner;

/** Math: approximate the square root */
public class Exercise_6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        long n = input.nextLong();

        System.out.println("The approximate square root of " + n + " is " + sqrt(n));

    }

    public static double sqrt(long n) {
        double nextGuess = 1.0;
        double lastGuess;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) * 0.5;
        } while (Math.abs(nextGuess - lastGuess) >= 0.00001);

        return nextGuess;
    }
}
