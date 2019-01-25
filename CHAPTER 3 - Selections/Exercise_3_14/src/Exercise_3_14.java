import java.util.Scanner;

public class Exercise_3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int)(Math.random() * 2);

        System.out.print("Guess heads (0) or tails (1): ");
        int guess = input.nextInt();

        System.out.println((guess == coin ? "Correct" : "Incorrect"));
    }
}
