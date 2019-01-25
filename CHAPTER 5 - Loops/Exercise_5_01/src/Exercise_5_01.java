import java.util.Scanner;

public class Exercise_5_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");

        int number, countPos = 0, countNeg = 0;
        double total = 0;

        while ((number = input.nextInt()) != 0) {
            total += number;

            if (number > 0) {
                countPos++;
            } else {
                countNeg++;
            }
        }

        if (countNeg + countPos == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }

        System.out.println("The number of positives is " + countPos);
        System.out.println("The number of negatives is " + countNeg);
        System.out.println("The total is " + total);
        System.out.println("The average is " + (total / (countNeg + countPos)));
    }
}
