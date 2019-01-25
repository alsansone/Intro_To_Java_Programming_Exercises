import java.util.Scanner;

/** Revise selection sort */
public class Exercise_7_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        selectionSortMax(list);

        for (int j = 0; j < list.length; j++)
            System.out.print(list[j] + " ");
        System.out.println();

    }

    public static void selectionSortMax(double[] list) {

        for (int i = list.length-1; i >= 0; i--) {
            double max = list[i];
            int maxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (max < list[j]) {
                    max = list[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                list[maxIndex] = list[i];
                list[i] = max;
            }
        }
    }
}
