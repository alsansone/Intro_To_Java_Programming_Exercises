import java.util.Scanner;
/** Game: lottery */
public class Exercise_5_32 {
    public static void main(String[] args) {

        int firstNumber = (int)(Math.random() * 10);
        int secondNumber = (int)(Math.random() * 10);

        // Check if numbers match
        while (firstNumber == secondNumber) {
            secondNumber = (int)(Math.random() * 10);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

        // Check guess
        if (guess / 10 == firstNumber && guess % 10 == secondNumber) {
            System.out.println("Exact match: you win $10,000");
        } else if (guess % 10 == firstNumber && guess / 10 == secondNumber) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guess / 10 == firstNumber || guess / 10 == secondNumber ||
        guess % 10 == firstNumber || guess % 10 == secondNumber) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry no match");
        }
        System.out.println("Lottery number is " + firstNumber + secondNumber);
    }
}
