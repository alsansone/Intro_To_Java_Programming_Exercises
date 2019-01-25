import java.util.Scanner;

public class Exercise_3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lotteryNumber = 123;//(int) (Math.random() * 1000);

        System.out.print("Enter your three digit lottery guess: ");
        int guess = input.nextInt();

        // Extract lottery numbers
        int lotteryNumber1 = lotteryNumber / 100;
        int lotteryNumber2 = (lotteryNumber % 100) / 10;
        int lotteryNumber3 = lotteryNumber % 10;
        // Extract guess numbers
        int guessNumber1 = guess / 100;
        int guessNumber2 = (guess % 100) / 10;
        int guessNumber3 = guess % 10;

        System.out.println("The lottery number is " + lotteryNumber);
        // Check the digits
        if (lotteryNumber == guess) {
            System.out.println("Exact match. You win $10,000!!!");
        } else if ((guessNumber1 == lotteryNumber2 && guessNumber2 == lotteryNumber1
                && guessNumber3 == lotteryNumber3)
                || (guessNumber1 == lotteryNumber2 && guessNumber2 == lotteryNumber3
                && guessNumber3 == lotteryNumber1)
                || (guessNumber1 == lotteryNumber3 && guessNumber2 == lotteryNumber1
                && guessNumber3 == lotteryNumber2)
                || (guessNumber1 == lotteryNumber3 && guessNumber2 == lotteryNumber2
                && guessNumber3 == lotteryNumber1)
                || (guessNumber1 == lotteryNumber1 && guessNumber2 == lotteryNumber3
                && guessNumber3 == lotteryNumber2)) {
            System.out.println("Matched all digits. You win $3000!!");
        } else if (guessNumber1 == lotteryNumber1 || guessNumber1 == lotteryNumber2
                || guessNumber1 == lotteryNumber3
                || guessNumber2 == lotteryNumber1 || guessNumber2 == lotteryNumber2
                || guessNumber2 == lotteryNumber3
                || guessNumber3 == lotteryNumber1 || guessNumber3 == lotteryNumber2
                || guessNumber3 == lotteryNumber3) {
            System.out.println("Matched one digit. You win $1000!");
        } else {
            System.out.println("No match. Better luck next time.");
        }
    }
}
