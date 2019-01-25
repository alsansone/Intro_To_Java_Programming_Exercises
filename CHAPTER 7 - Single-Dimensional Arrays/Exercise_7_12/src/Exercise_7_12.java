import java.util.Scanner;

/** Reverse an array */
public class Exercise_7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // call method and display results
        reverse(array);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

    }

    public static int[] reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
