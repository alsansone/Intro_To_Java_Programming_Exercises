import java.util.Scanner;

public class Exercise_8_13 {
    public static void main(String[] args) {

        double[][] array = getArray();

        int[] largestIndices = locateLargest(array);

        System.out.println("The location of the largest element is at (" + largestIndices[0] +
                "," + largestIndices[1] + ")");

    }
    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];

        System.out.print("Enter the array: ");
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = input.nextDouble();
            }
        }
        return array;
    }
    public static int[] locateLargest(double[][] a) {
        double currentLargest = a[0][0];
        int[] currentLargestIndex = new int[2];

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if (currentLargest < a[r][c]) {
                    currentLargest = a[r][c];
                    currentLargestIndex[0] = r;
                    currentLargestIndex[1] = c;
                }
            }
        }
        return currentLargestIndex;
    }
}
