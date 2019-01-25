import java.util.Scanner;

/** Find the index of the smallest element */
public class Exercise_7_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The smallest number is at index " + indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array) {
        int minIndex = 0;
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
