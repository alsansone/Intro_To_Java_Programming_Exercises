import java.util.Scanner;

/** Statistics: compute mean and standard deviation */
public class Exercise_5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        double mean = 0;
        double deviation = 0;

        for (int i = 1; i <= 10; i++) {
            double number = input.nextDouble();
            mean += number;
            deviation += Math.pow(number, 2);
        }
        // Calculate deviation and mean
        deviation = Math.sqrt((deviation - Math.pow(mean, 2) / 10) / 9);
        mean /= 10;

        System.out.printf("The standard deviation for the numbers entered is %-10.5f\n", deviation);
        System.out.println("The mean is " + mean);
    }
}
