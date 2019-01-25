import java.util.Scanner;

/** Average in array */
public class Exercise_7_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The average of the numbers entered is " + average(array));

    }

    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
