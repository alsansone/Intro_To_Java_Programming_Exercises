import java.util.Scanner;

/** Bubble sort */
public class Exercise_7_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        for (int j = 0; j < array.length; j++) {
            array[j] = input.nextDouble();
        }

        bubbleSort(array);

        for (double v : array) {
            System.out.print(v + " ");
        }
        System.out.println();

    }

    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
