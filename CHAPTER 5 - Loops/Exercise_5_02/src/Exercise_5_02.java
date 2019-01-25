import java.util.Scanner;

public class Exercise_5_02 {
    public static void main(String[] args) {
        int correctCount = 0; // Count correct answers
        int count = 0; // Count # of questions asked
        long starTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);

        while (count < 10) {
            // Generate two random #'s between 0 an 15
            int number1 = (int)(1 + Math.random() * 15);
            int number2 = (int)(1 + Math.random() * 15);

            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("You are correct");
                correctCount++;
            } else {
                System.out.println("Your answer is incorrect.\n" + number1 +
                        " + " + number2 + " = " + (number1 + number2));
            }
            // Increment count
            count++;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("You got " + correctCount + " correct out of 10\n" +
                "Test time was " + (endTime - starTime) / 1000 + " seconds");
    }
}
